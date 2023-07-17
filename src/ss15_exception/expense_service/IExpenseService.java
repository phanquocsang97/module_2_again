package ss15_exception.expense_service;

public interface IExpenseService {
    void displayExpense();

    void addNewExpense();

    void removeExpense();

    void editExpense();

    void searchIdExpense();

    void searchNameExpense();
    void sortByName();
    void sortByPrice();
}
