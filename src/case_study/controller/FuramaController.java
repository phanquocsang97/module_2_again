package case_study.controller;

import case_study.utils.ReadAndWrite;

public class FuramaController {
    public void displayMenu(){
        do {
                System.out.println("-----FURAMA MANAGEMENT------" +
                        "\n1.EMPLOYEE MANAGEMENT" +
                        "\n2.CUSTOMER MANAGEMENT" +
                        "\n3.FACILITY MANAGEMENT" +
                        "\n4.BOOKING MANAGEMENT" +
                        "\n5.PROMOTION MANAGEMT" +
                        "\n6.EXIT PROGRAM" +
                        "\n SELECT YOUR OPTION"
                        );
                int select = ReadAndWrite.inputInput();
                switch (select){
                    case 1:
                        System.out.println("EMPLOYEE MANAGEMENT");
                        EmployeeManagement employeeManagement = new EmployeeManagement();
                        employeeManagement.selectEmployeee();
                        break;
                    case 2:
                        System.out.println("CUSTOMER MANAGEMENT");
                        CustomerManagement customerManagement = new CustomerManagement();
                        customerManagement.selectCustomer();
                        break;
                    case 3:
                        System.out.println("FACILITY MANAGEMENT");
                        FacilityManagement facilityManagement = new FacilityManagement();
                        facilityManagement.selecyFacility();
                        break;
                    case 4:
                        System.out.println("BOOKING MANAGEMENT");
                        BookingManagement bookingManagement = new BookingManagement();
                        bookingManagement.selectBooking();
                        break;
                    case 5:
                        System.out.println("PROMOTION MANAGEMENT");
                        break;
                    case 6:
                        System.out.println("EXIT PROGRAM");
                        System.exit(0);
                    default:
                        System.out.println("INPUT AGAIN!!");
                        break;
                }
        }while (true);
    }
}
