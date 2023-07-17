package ss15_exception.expense_repository;

import ss13_search.expense_model.Expense;

import java.util.List;

public interface IExpenseRepository {
    List<ss13_search.expense_model.Expense> displayExpense();
    void addNewExpense(ss13_search.expense_model.Expense expense);
    void removeExpense(int index);
    void editExpense(int index, ss13_search.expense_model.Expense expense);
    int searchIdExpense(int id);
    Expense getExpense(int index);
    List<Expense> searchNameExpense(String name);
}
