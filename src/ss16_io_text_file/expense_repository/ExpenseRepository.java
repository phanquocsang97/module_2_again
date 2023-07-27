package ss16_io_text_file.expense_repository;

import ss16_io_text_file.expense_model.Expense;
import ss16_io_text_file.expense_utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository implements IExpenseRepository{
    @Override
    public List<Expense> displayListExpense() {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_EXPENSE);
        List<Expense> expenseList = new ArrayList<>();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            expenseList.add(new Expense(Integer.parseInt(info[0]),info[1],info[2],Integer.parseInt(info[3]),info[4]));
        }
        return expenseList;
    }

    @Override
    public void addNewExpense(Expense expense) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_EXPENSE);
        stringList.add(expense.convertToString());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_EXPENSE,stringList,false);
    }

    @Override
    public void removeExpense(int index) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_EXPENSE);
        stringList.remove(index);
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_EXPENSE,stringList,false);
    }

    @Override
    public void editExpense(int index, Expense expense) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_EXPENSE);
        stringList.set(index,expense.convertToString());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_EXPENSE,stringList,false);
    }

    @Override
    public int searchIdExpense(int id) {
        for (int i = 0; i < displayListExpense().size(); i++) {
            if (displayListExpense().get(i).getIdExpense() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Expense getExpense(int index) {
        return displayListExpense().get(index);
    }

    @Override
    public List<Expense> searchNameExpense(String name) {
        List<Expense> expenseList = new ArrayList<>();
        for (Expense e: displayListExpense()) {
            if (e.getNameExpense().contains(name)){
                expenseList.add(e);
            }
        }
        return expenseList;
    }
}
