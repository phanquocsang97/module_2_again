package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;
import case_study.utils.ReadAndWrite;

public class FacilityManagement {
    private final IFacilityService facilityService = new FacilityService();
    public void selecyFacility(){
        boolean flag = true;
        do {
            System.out.println("-----FACILITY MANAGEMENT-----" +
                    "\n1.Display list facility" +
                    "\n2.Add new facility" +
                    "\n3.Display list facility maintenance" +
                    "\n4.Delete facility" +
                    "\n5.Return main menu" +
                    "\nSelect your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Display list facility");
                    facilityService.display();
                    break;
                case 2:
                    System.out.println("Add new facility");
                    facilityService.add();
                    break;
                case 3:
                    System.out.println("Display list facility maintenance");
                    facilityService.displayAllMaintenance();
                    break;
                case 4:
                    System.out.println("Remove facility ");
                    facilityService.remove();
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
