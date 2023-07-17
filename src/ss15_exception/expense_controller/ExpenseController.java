package ss15_exception.expense_controller;

import ss15_exception.expense_service.ExpenseService;
import ss15_exception.expense_service.IExpenseService;

import static ss15_exception.expense_view.Run.scanner;

public class ExpenseController {
    public void displayMenu() {
        IExpenseService expenseService = new ExpenseService();
        do {
            System.out.println("EXPENSE MANAGEMENT" +
                    "\n1.Display list expense" +
                    "\n2.Add new expense" +
                    "\n3.Remove a expense" +
                    "\n4.Edit a expense" +
                    "\n5.Search expense by id" +
                    "\n6.Search expense by name" +
                    "\n7.Sort list by name" +
                    "\n8.Sort list by price -> name" +
                    "\n9.Exit Program"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list expense");
                    expenseService.displayExpense();
                    break;
                case 2:
                    System.out.println("Add new expense");
                    expenseService.addNewExpense();
                    break;
                case 3:
                    System.out.println("Remove a expense");
                    expenseService.removeExpense();
                    break;
                case 4:
                    System.out.println("Edit a expense");
                    expenseService.editExpense();
                    break;
                case 5:
                    System.out.println("Search expense by id");
                    expenseService.searchIdExpense();
                    break;
                case 6:
                    System.out.println("Search expense by name");
                    expenseService.searchNameExpense();
                    break;
                case 7:
                    System.out.println("Sort list by name");
                    expenseService.sortByName();
                    break;
                case 8:
                    System.out.println("Sort list by price -> name");
                    expenseService.sortByPrice();
                    break;
                case 9:
                    System.out.println("Exit Program");
                    System.exit(0);
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        } while (true);
    }
}
