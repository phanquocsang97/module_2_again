package ss16_io_text_file.expense_controller;

import ss16_io_text_file.expense_service.ExpenseService;
import ss16_io_text_file.expense_service.IExpenseService;
import ss16_io_text_file.expense_utils.ReadAndWrite;

import static ss16_io_text_file.expense_view.Run.scanner;

public class ExpenseController {
    private final IExpenseService expenseService = new ExpenseService();
    public void displayMenu() {

        do {
            System.out.println("EXPENSE MANAGEMENT" +
                    "\n1.Display list expense" +
                    "\n2.Add a expense" +
                    "\n3.Remove a expense" +
                    "\n4.Edit a expense" +
                    "\n5.Search expense by Id" +
                    "\n6.Search expense by Name" +
                    "\n7.Exit program"
                    );
            int choose = ReadAndWrite.inputInt();
            switch (choose){
                case 1:
                    System.out.println("Display list expense");
                    expenseService.displayListExpense();
                    break;
                case 2:
                    System.out.println("Add a expense");
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
                    expenseService.searchById();
                    break;
                case 6:
                    System.out.println("Search expense by name");
                    expenseService.searchByName();
                    break;
                case 7:
                    System.out.println("Exit program");
                    System.exit(0);
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        }while (true);
    }
}

