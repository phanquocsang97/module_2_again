package case_study.furama_controller;

import case_study.service.impl.CustomerService;
import case_study.service.ICustomerService;
import case_study.furama_utils.ReadAndWrite;

public class CustomerManagement {
    private final ICustomerService customerService = new CustomerService();
    public void selectCustomer(){
        boolean flag = true;
        do {
            System.out.println("-----CUSTOMER MANAGEMENT-----" +
                    "\n1.Display list customers" +
                    "\n2.Add new customer" +
                    "\n3.Edit customer" +
                    "\n4.Remove customer" +
                    "\n5.Search by name customer" +
                    "\n6.Return main menu" +
                    "\nSelect your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Display list customers");
                    customerService.displayListCustomer();
                    break;
                case 2:
                    System.out.println("Add new customer");
                    customerService.addNewCustomer();
                    break;
                case 3:
                    System.out.println("Edit customer");
                    customerService.editCustomer();
                    break;
                case 4:
                    System.out.println("Remove customer");
                    customerService.removeCustomer();
                    break;
                case 5:
                    System.out.println("Search by name customer");
                    customerService.searchCustomerByName();
                    break;
                case 6:
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Input Again!!");
                    break;
            }
        }while (flag);
    }
}
