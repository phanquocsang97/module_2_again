package ss13_search.expense_repository;

import ss13_search.expense_model.Expense;

import java.util.List;

public interface IExpenseRepository {
    List<Expense> displayExpense();
    void addNewExpense(Expense expense);
    void removeExpense(int index);
    void editExpense(int index, Expense expense);
    int searchIdExpense(int id);
    Expense getExpense(int index);
    List<Expense> searchNameExpense(String name);
}
