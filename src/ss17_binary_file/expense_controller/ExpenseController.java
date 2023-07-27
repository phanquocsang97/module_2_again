package ss17_binary_file.expense_controller;

import ss17_binary_file.expense_service.ExpenseService;
import ss17_binary_file.expense_service.IExpenseService;
import ss17_binary_file.expense_util.ReadAndWriteBinary;

public class ExpenseController {
    IExpenseService expenseService = new ExpenseService();
    public void displayMenu(){
        do {
            System.out.println("EXPENSE MANAGEMENT" +
                    "\n1.Display list expense" +
                    "\n2.Add new expense" +
                    "\n3.Remove a expense" +
                    "\n4.Edit a expense" +
                    "\n5.Search expense by id" +
                    "\n6.Search expense by name" +
                    "\n7.Exit program"
                    );
            int choose = ReadAndWriteBinary.inputInt();
            switch (choose){
                case 1:
                    System.out.println("Display list expense");
                    expenseService.display();
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
                    System.out.println("Search by Id");
                    expenseService.searchById();
                    break;
                case 6:
                    System.out.println("Exit Program");
                    System.exit(0);
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        }while (true);
    }
}
