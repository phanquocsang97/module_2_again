package case_study.repository.impl;

import case_study.model.person.Customer;
import case_study.repository.ICustomerRepository;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_PATH_FILE = "D:\\CodeGym\\module_2_again\\src\\case_study\\data\\customer.csv";
    @Override
    public List<Customer> displayCustomer() {
        List<String> stringList = ReadAndWrite.readFileBook(CUSTOMER_PATH_FILE);
        List<Customer> customerList = new ArrayList<>();
        String[] info = null;
        for (String s : stringList){
            info = s.split(",");
            Customer customer = new Customer(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        List<String> stringList = ReadAndWrite.readFileBook(CUSTOMER_PATH_FILE);
        stringList.add(customer.convertToStringCustomer());
        ReadAndWrite.writeFileBook(CUSTOMER_PATH_FILE,stringList,false);
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        List<String> stringList = ReadAndWrite.readFileBook(CUSTOMER_PATH_FILE);
        stringList.set(index,customer.convertToStringCustomer());
        ReadAndWrite.writeFileBook(CUSTOMER_PATH_FILE,stringList,false);
    }

    @Override
    public void removeCustomer(int index) {
        List<String> stringList = ReadAndWrite.readFileBook(CUSTOMER_PATH_FILE);
        stringList.remove(index);
        ReadAndWrite.writeFileBook(CUSTOMER_PATH_FILE,stringList,false);
    }

    @Override
    public List<Customer> searchByNameCustomer(String name) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : displayCustomer()){
            if (customer.getName().contains(name)){
                customerList.add(customer);
            }
        }
        return customerList;
    }

    @Override
    public Customer getCustomer(int index) {
        return displayCustomer().get(index);
    }

    @Override
    public int searchIdCustomer(String id) {
        for (int i = 0; i < displayCustomer().size(); i++) {
            if (id.equals(displayCustomer().get(i).getIdCustomer())){
                return i;
            }
        }
        return -1;
    }
}
