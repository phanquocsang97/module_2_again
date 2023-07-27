package ss16_io_text_file.expense_service;

public interface IExpenseService {
    void displayListExpense();
    void addNewExpense();
    void removeExpense();
    void editExpense();
    void searchById();
    void searchByName();
}
