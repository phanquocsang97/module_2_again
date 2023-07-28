package case_study.furama_controller;

import case_study.furama_service.class_service.BookingService;
import case_study.furama_service.interface_service.IBookingService;
import case_study.furama_utils.ReadAndWrite;

public class BookingManagement {
    public void selectBooking(){
        boolean flag = true;
        do {
            System.out.println("-----BOOKING MANAGEMENT-----" +
                    "\n1.Add new booking" +
                    "\n2.Display list booking" +
                    "\n3.Create new contract" +
                    "\n4.Display list contracts" +
                    "\n5.Edit contract" +
                    "\n6.Return main menu" +
                    "Select your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Add new booking");
                    break;
                case 2:
                    System.out.println("Display list booking");
                    break;
                case 3:
                    System.out.println("Create new contract");
                    break;
                case 4:
                    System.out.println("Display list contracts");
                    break;
                case 5:
                    System.out.println("Edit contract");
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
