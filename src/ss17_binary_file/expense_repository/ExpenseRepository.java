package ss17_binary_file.expense_repository;

import ss17_binary_file.expense_model.Expense;
import ss17_binary_file.expense_util.ReadAndWriteBinary;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository implements IExpenseRepository {
    @Override
    public List<Expense> displayList() {
        List<Expense> expenseList = ReadAndWriteBinary.readListFile();
        return expenseList;
    }

    @Override
    public void addNewExpense(Expense expense) {
        List<Expense> expenseList = ReadAndWriteBinary.readListFile();
        expenseList.add(expense);
        ReadAndWriteBinary.writeListFile(expenseList);
    }

    @Override
    public void removeExpense(int index) {
        List<Expense> expenseList = ReadAndWriteBinary.readListFile();
        expenseList.remove(index);
        ReadAndWriteBinary.writeListFile(expenseList);
    }

    @Override
    public void editExpense(int index, Expense expense) {
        List<Expense> expenseList = ReadAndWriteBinary.readListFile();
        expenseList.set(index,expense);
        ReadAndWriteBinary.writeListFile(expenseList);
    }

    @Override
    public int searchIdExpense(int id) {
        for (int i = 0; i < displayList().size(); i++) {
            if (displayList().get(i).getIdExpense() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Expense getExpense(int index) {
        return displayList().get(index);
    }

}


