package case_study.furama_service.class_service;

import case_study.furama_common.exception.IdNotFoundException;
import case_study.furama_common.exception.UniqueIdException;
import case_study.furama_common.validate.Validate;
import case_study.furama_model.person.Employee;
import case_study.furama_repository.class_repository.EmployeeRepository;
import case_study.furama_repository.interface_repository.IEmployeeRepository;
import case_study.furama_service.interface_service.IEmployeeService;
import case_study.furama_utils.ReadAndWrite;

import java.util.List;

import static case_study.furama_view.Run.scanner;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayListEmployee() {
        for (Employee employee : employeeRepository.displayListEmployee()) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNewEmployee() {
        try {
            System.out.println("Enter new id employee");
            String id = Validate.validateIdEmployee();
            int index = employeeRepository.searchByIdEmployee(id);
            if (index == -1) {
                System.out.println("Enter name employee");
                String name = Validate.validateNameAndType();
                System.out.println("Enter day of birth employee");
                String date = Validate.validateDate();
                System.out.println("Enter gender of employee");
                String gender = Validate.validateGender();
                System.out.println("Enter identify of employee");
                String identify = Validate.validateIdentifyNumber();
                System.out.println("Enter phone number of employee");
                String phoneNumber = Validate.validatePhoneNumber();
                System.out.println("Enter email of employee");
                String email = Validate.validateEmail();
                System.out.println("Enter level of employee");
                String level = scanner.nextLine();
                System.out.println("Enter position of employee");
                String position = scanner.nextLine();
                System.out.println("Enter salary of employee");
                int salary = Validate.validateSalary();
                Employee employee = new Employee(id, name, date, gender, identify, phoneNumber, email, level, position, salary);
                employeeRepository.addNewEmployee(employee);
            } else {
                throw new UniqueIdException();
            }
        } catch (UniqueIdException e) {
            System.out.println("Id already exist!!!");
        }
    }

    @Override
    public void removeEmployee() {
        try {
            System.out.println("Enter id you want to remove");
            String id = Validate.validateIdEmployee();
            int index = employeeRepository.searchByIdEmployee(id);
            if (index == -1) {
                throw new IdNotFoundException("Id doesnt exist");
            } else {
                System.out.println(employeeRepository.getEmployee(index));
                System.out.println("Enter yes to remove this employee");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    employeeRepository.removeEmployee(index);
                } else {
                    System.out.println("Cancel!!!");
                }
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void editEmployee() {
        boolean flag = true;
        try {
            System.out.println("Enter id you want to edit");
            String id = Validate.validateIdEmployee();
            int index = employeeRepository.searchByIdEmployee(id);
            if (index == -1) {
                throw new IdNotFoundException("Id doesnt exist!!!");
            } else {
                Employee employee = employeeRepository.getEmployee(index);
                do {
                    System.out.println("Enter info you want to edit" +
                            "\n1.Edit name" +
                            "\n2.Edit date" +
                            "\n3.Edit gender" +
                            "\n4.Edit identify" +
                            "\n5.Edit phone number" +
                            "\n6.Edit email" +
                            "\n7.Edit level" +
                            "\n8.Edit position" +
                            "\n9.Edit salary" +
                            "\n10.Save Info"
                    );
                    int select = ReadAndWrite.inputInput();
                    switch (select) {
                        // id,name,date,gender,identify,phoneNumber,email,level,position,salary
                        case 1:
                            System.out.println("Edit name");
                            String newName = Validate.validateNameAndType();
                            employee.setName(newName);
                            break;
                        case 2:
                            System.out.println("Edit date");
                            String newDate = Validate.validateDate();
                            employee.setDate(newDate);
                            break;
                        case 3:
                            System.out.println("Edit gender");
                            String newGender = Validate.validateGender();
                            employee.setGender(newGender);
                            break;
                        case 4:
                            System.out.println("Edit identify");
                            String newIdentify = Validate.validateIdentifyNumber();
                            employee.setIdentifyNumber(newIdentify);
                            break;
                        case 5:
                            System.out.println("Edit phone number");
                            String newPhone = Validate.validatePhoneNumber();
                            employee.setPhoneNumber(newPhone);
                            break;
                        case 6:
                            System.out.println("Edit email");
                            String newEmail = Validate.validateEmail();
                            employee.setEmail(newEmail);
                            break;
                        case 7:
                            System.out.println("Edit level");
                            String newLevel = scanner.nextLine();
                            employee.setLevelEmployee(newLevel);
                            break;
                        case 8:
                            System.out.println("Edit position");
                            String newPosition = scanner.nextLine();
                            employee.setPositionEmployee(newPosition);
                            break;
                        case 9:
                            System.out.println("Edit salary");
                            int salary = Validate.validateSalary();
                            employee.setSalaryEmployee(salary);
                            break;
                        case 10:
                            System.out.println("Save info");
                            flag = false;
                            break;
                        default:
                            System.out.println("Input Wrong!!");
                            break;
                    }
                } while (flag);
                System.out.println("Enter yes to save info");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    employeeRepository.editEmployee(index, employee);
                }
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void searchByNameEmployee() {
        System.out.println("Enter name you want to search");
        String name = Validate.validateNameAndType();
        List<Employee> employeeList = employeeRepository.searchByNameEmployee(name);
        if (employeeList.size() == 0){
            System.out.println("Name doesnt exist!!!");
        }else {
            for (Employee employee : employeeList){
                System.out.println(employee);
            }
        }
    }
}
