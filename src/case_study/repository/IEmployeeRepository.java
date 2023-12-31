package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayListEmployee();
    void addNewEmployee(Employee employee);
    void editEmployee(int index,Employee employee);
    void removeEmployee(int index);
    List<Employee> searchByNameEmployee(String name);
    Employee getEmployee(int index);
    int searchByIdEmployee(String id);
}
