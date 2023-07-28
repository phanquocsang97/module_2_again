package case_study.furama_controller;

import case_study.furama_service.class_service.CustomerService;
import case_study.furama_service.interface_service.ICustomerService;
import case_study.furama_utils.ReadAndWrite;

public class CustomerManagement {
    public void selectCustomer(){
        boolean flag = true;
        do {
            System.out.println("-----CUSTOMER MANAGEMENT-----" +
                    "\n1.Display list customers" +
                    "\n2.Add new customer" +
                    "\n3.Edit customer" +
                    "\n4.Delete customer" +
                    "\n5.Search by name customer" +
                    "\n6.Return main menu" +
                    "Select your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Display list customers");
                    break;
                case 2:
                    System.out.println("Add new customer");
                    break;
                case 3:
                    System.out.println("Edit customer");
                    break;
                case 4:
                    System.out.println("Delete customer");
                    break;
                case 5:
                    System.out.println("Search by name customer");
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
