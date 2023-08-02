package case_study.service.impl;

import case_study.common.exception.CustomerException;
import case_study.common.exception.EmployeeException;
import case_study.common.exception.IdNotFoundException;
import case_study.common.exception.UniqueIdException;
import case_study.common.validate.CustomerValidate;
import case_study.common.validate.EmployeeValidate;
import case_study.common.validate.Validate;
import case_study.model.person.Employee;
import case_study.repository.impl.EmployeeRepository;
import case_study.repository.IEmployeeRepository;
import case_study.service.IEmployeeService;
import case_study.utils.ReadAndWrite;

import java.util.List;

import static case_study.view.Run.scanner;

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
        System.out.println("Enter new id employee");
        String id = "";
        do {
            try {
                id = scanner.nextLine();
                if (EmployeeValidate.checkIdEmployee(id)) {
                    break;
                }
            } catch (EmployeeException e) {
                System.out.println("Input Wrong!!!");
            }
        } while (true);
        try {
            int index = employeeRepository.searchByIdEmployee(id);
            if (index == -1) {
                System.out.println("Enter name employee");
                String name = "";
                do {
                    try {
                        name = scanner.nextLine();
                        if (EmployeeValidate.checkNameEmployee(name)) {
                            break;
                        }
                    } catch (EmployeeException e) {
                        System.out.println("Input Wrong!!!");
                    }
                } while (true);
                System.out.println("Enter day of birth employee");
                String date = "";
                do {
                    try {
                        date = scanner.nextLine();
                        if (EmployeeValidate.checkDateEmployee(date)) {
                            break;
                        }
                    } catch (EmployeeException e) {
                        System.out.println("Input Wrong!!!");
                    }
                } while (true);
                System.out.println("Enter gender of employee");
                String gender = Validate.validateGender();
                System.out.println("Enter identify of employee");
                String identify = "";
                do {
                    try {
                        identify = scanner.nextLine();
                        if (EmployeeValidate.checkIdentifyEmployee(identify)) {
                            break;
                        }
                    } catch (EmployeeException e) {
                        System.out.println("Input Wrong!!!");
                    }
                } while (true);
                System.out.println("Enter phone number of employee");
                String phoneNumber = "";
                do {
                    try {
                        phoneNumber = scanner.nextLine();
                        if (EmployeeValidate.checkPhoneEmployee(phoneNumber)) {
                            break;
                        }
                    } catch (EmployeeException e) {
                        System.out.println("Input Wrong!!!");
                    }
                } while (true);
                System.out.println("Enter email of employee");
                String email = Validate.validateEmail();
                System.out.println("Enter level of employee");
                String level = Validate.validateLevel();
                System.out.println("Enter position of employee");
                String position = Validate.validatePosition();
                System.out.println("Enter salary of employee");
                int salary = 0;
                do {
                    try {
                        salary = Integer.parseInt(scanner.nextLine());
                        if (EmployeeValidate.checkSalaryEmployee(salary)) {
                            break;
                        }
                    } catch (EmployeeException e) {
                        System.out.println("Input Wrong!!!");
                    }
                } while (true);
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
            String id ="";
            do {
                try {
                    id = scanner.nextLine();
                    if (EmployeeValidate.checkIdEmployee(id)) {
                        break;
                    }
                } catch (EmployeeException e) {
                    System.out.println("Input Wrong!!!");
                }
            } while (true);
            int index = employeeRepository.searchByIdEmployee(id);
            if (index == -1) {
                throw new IdNotFoundException("Id doesnt exist");
            } else {
                System.out.println(employeeRepository.getEmployee(index));
                System.out.println("Enter yes if you want to remove this employee");
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
            String id = "";
            do {
                try {
                    id = scanner.nextLine();
                    if (EmployeeValidate.checkIdEmployee(id)) {
                        break;
                    }
                } catch (EmployeeException e) {
                    System.out.println("Input Wrong!!!");
                }
            } while (true);
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
                            System.out.println("New name");
                            String newName = "";
                            do {
                                try {
                                    newName = scanner.nextLine();
                                    if (EmployeeValidate.checkNameEmployee(newName)) {
                                        break;
                                    }
                                } catch (EmployeeException e) {
                                    System.out.println("Input Wrong!!!");
                                }
                            } while (true);
                            employee.setName(newName);
                            break;
                        case 2:
                            System.out.println("New date");
                            String newDate = "";
                            do {
                                try {
                                    newDate = scanner.nextLine();
                                    if (EmployeeValidate.checkDateEmployee(newDate)) {
                                        break;
                                    }
                                } catch (EmployeeException e) {
                                    System.out.println("Input Wrong!!!");
                                }
                            } while (true);
                            employee.setDate(newDate);
                            break;
                        case 3:
                            System.out.println("New gender");
                            String newGender = Validate.validateGender();
                            employee.setGender(newGender);
                            break;
                        case 4:
                            System.out.println("New identify");
                            String newIdentify = "";
                            do {
                                try {
                                    newIdentify = scanner.nextLine();
                                    if (EmployeeValidate.checkIdentifyEmployee(newIdentify)) {
                                        break;
                                    }
                                } catch (EmployeeException e) {
                                    System.out.println("Input Wrong!!!");
                                }
                            } while (true);
                            employee.setIdentifyNumber(newIdentify);
                            break;
                        case 5:
                            System.out.println("New phone number");
                            String newPhone = "";
                            do {
                                try {
                                    newPhone = scanner.nextLine();
                                    if (EmployeeValidate.checkPhoneEmployee(newPhone)) {
                                        break;
                                    }
                                } catch (EmployeeException e) {
                                    System.out.println("Input Wrong!!!");
                                }
                            } while (true);
                            employee.setPhoneNumber(newPhone);
                            break;
                        case 6:
                            System.out.println("New email");
                            String newEmail = Validate.validateEmail();
                            employee.setEmail(newEmail);
                            break;
                        case 7:
                            System.out.println("New level");
                            String newLevel = Validate.validateLevel();
                            employee.setLevelEmployee(newLevel);
                            break;
                        case 8:
                            System.out.println("New position");
                            String newPosition = Validate.validatePosition();
                            employee.setPositionEmployee(newPosition);
                            break;
                        case 9:
                            System.out.println("New salary");
                            int salary = 0;
                            do {
                                try {
                                    salary = Integer.parseInt(scanner.nextLine());
                                    if (EmployeeValidate.checkSalaryEmployee(salary)) {
                                        break;
                                    }
                                } catch (EmployeeException e) {
                                    System.out.println("Input Wrong!!!");
                                }
                            } while (true);
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
                } else {
                    System.out.println("Cancel!!!");
                }
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void searchByNameEmployee() {
        System.out.println("Enter name you want to search");
        String name = scanner.nextLine();
        List<Employee> employeeList = employeeRepository.searchByNameEmployee(name);
        if (employeeList.size() == 0) {
            System.out.println("Name doesnt exist!!!");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }
}
