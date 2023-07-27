package ss16_io_text_file.expense_view;

import ss16_io_text_file.expense_controller.ExpenseController;
import ss16_io_text_file.expense_model.Expense;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();
        expenseController.displayMenu();
    }
}
