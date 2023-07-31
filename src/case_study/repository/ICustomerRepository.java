package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayCustomer();
    void addNewCustomer(Customer customer);
    void editCustomer(int index,Customer customer);
    void removeCustomer(int index);
    List<Customer> searchByNameCustomer(String name);
    Customer getCustomer(int index);
    int searchIdCustomer(String id);
}
