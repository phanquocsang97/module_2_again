package ss15_exception.expense_view;

import ss15_exception.expense_controller.ExpenseController;
import ss15_exception.expense_utils.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();
        expenseController.displayMenu();

    }
}
