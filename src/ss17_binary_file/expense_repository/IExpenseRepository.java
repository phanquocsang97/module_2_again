package ss17_binary_file.expense_repository;

import ss17_binary_file.expense_model.Expense;

import java.util.List;

public interface IExpenseRepository {
    List<Expense> displayList();
    void addNewExpense(Expense expense);
    void removeExpense(int index);
    void editExpense(int index,Expense expense);
    int searchIdExpense(int id);
    Expense getExpense(int index);


}
