package ss16_io_text_file.expense_repository;

import ss16_io_text_file.expense_model.Expense;

import java.util.List;

public interface IExpenseRepository {
    List<Expense> displayListExpense();
    void addNewExpense(Expense expense);
    void removeExpense(int index);
    void editExpense(int index, Expense expense);
    int searchIdExpense(int id);
    Expense getExpense(int index);
    List<Expense> searchNameExpense(String name);
}
