package case_study.furama_controller;

import case_study.service.impl.EmployeeService;
import case_study.service.IEmployeeService;
import case_study.furama_utils.ReadAndWrite;

public class EmployeeManagement {
    private final IEmployeeService employeeService = new EmployeeService();
    public void selectEmployeee(){
        boolean flag = true;
        do {
            System.out.println("-----EMPLOYEE MANAGEMENT------" +
                    "\n1.Display list employees" +
                    "\n2.Add new employee" +
                    "\n3.Edit employee" +
                    "\n4.Remove employee" +
                    "\n5.Search by name employee" +
                    "\n6.Return main menu" +
                    "\nSelect your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Display list employees");
                    employeeService.displayListEmployee();
                    break;
                case 2:
                    System.out.println("Add new employee");
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    System.out.println("Edit employee");
                    employeeService.editEmployee();
                    break;
                case 4:
                    System.out.println("Remove employee");
                    employeeService.removeEmployee();
                    break;
                case 5:
                    System.out.println("Search by name employee");
                    employeeService.searchByNameEmployee();
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
