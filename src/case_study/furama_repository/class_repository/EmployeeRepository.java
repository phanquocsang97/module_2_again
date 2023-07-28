package case_study.furama_repository.class_repository;

import case_study.furama_model.person.Employee;
import case_study.furama_repository.interface_repository.IEmployeeRepository;
import case_study.furama_utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_PATH_FILE = "D:\\CodeGym\\module_2_again\\src\\case_study\\furama_data\\employee.csv";
    @Override
    public List<Employee> displayListEmployee() {
        List<String> stringList = ReadAndWrite.readFileBook(EMPLOYEE_PATH_FILE);
        List<Employee> employeeList = new ArrayList<>();
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            Employee employee = new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],Integer.parseInt(info[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        List<String> stringList = ReadAndWrite.readFileBook(EMPLOYEE_PATH_FILE);
        stringList.add(employee.convertToStringEmployee());
        ReadAndWrite.writeFileBook(EMPLOYEE_PATH_FILE,stringList,false);
    }

    @Override
    public void editEmployee(int index, Employee employee) {
        List<String> stringList = ReadAndWrite.readFileBook(EMPLOYEE_PATH_FILE);
        stringList.set(index,employee.convertToStringEmployee());
        ReadAndWrite.writeFileBook(EMPLOYEE_PATH_FILE,stringList,false);
    }

    @Override
    public void removeEmployee(int index) {
        List<String> stringList = ReadAndWrite.readFileBook(EMPLOYEE_PATH_FILE);
        stringList.remove(index);
        ReadAndWrite.writeFileBook(EMPLOYEE_PATH_FILE,stringList,false);
    }

    @Override
    public List<Employee> searchByNameEmployee(String name) {
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : displayListEmployee()){
            if (employee.getName().equals(name)){
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    @Override
    public Employee getEmployee(int index) {
        return displayListEmployee().get(index);
    }

    @Override
    public int searchByIdEmployee(String id) {
        List<Employee> employeeList = displayListEmployee();
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getIdEmployee())){
                index = i;
            }
        }
        return index;
    }
}
