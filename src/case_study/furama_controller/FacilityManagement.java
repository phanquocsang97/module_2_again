package case_study.furama_controller;

import case_study.furama_service.class_service.FacilityService;
import case_study.furama_service.interface_service.IFacilityService;
import case_study.furama_utils.ReadAndWrite;

public class FacilityManagement {
    public void selecyFacility(){
        boolean flag = true;
        do {
            System.out.println("-----FACILITY MANAGEMENT-----" +
                    "\n1.Display list facility" +
                    "\n2.Add new facility" +
                    "\n3.Display list facility maintenance" +
                    "\n4.Delete facility" +
                    "\n5.Return main menu" +
                    "Select your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Display list facility");
                    break;
                case 2:
                    System.out.println("Add new facility");
                    break;
                case 3:
                    System.out.println("Display list facility maintenance");
                    break;
                case 4:
                    System.out.println("Delete facility ");
                    break;
                case 5:
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
