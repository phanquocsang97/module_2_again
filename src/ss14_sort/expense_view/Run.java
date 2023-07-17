package ss14_sort.expense_view;

import ss13_search.expense_controller.ExpenseController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();
        expenseController.displayMenu();
    }
}
