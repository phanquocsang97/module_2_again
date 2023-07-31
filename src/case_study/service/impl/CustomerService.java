package case_study.service.impl;

import case_study.common.exception.CustomerException;
import case_study.common.exception.IdNotFoundException;
import case_study.common.exception.UniqueIdException;
import case_study.common.validate.CustomerValidate;
import case_study.common.validate.Validate;
import case_study.model.person.Customer;
import case_study.repository.impl.CustomerRepository;
import case_study.repository.ICustomerRepository;
import case_study.service.ICustomerService;
import case_study.utils.ReadAndWrite;

import java.util.List;

import static case_study.view.Run.scanner;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayListCustomer() {
        for (Customer customer : customerRepository.displayCustomer()) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNewCustomer() {
        System.out.println("Enter id");
        String id = "";
        do {
            try {
                id = scanner.nextLine();
                if (CustomerValidate.checkIdCustomer(id)) {
                    break;
                }
            } catch (CustomerException e) {
                System.out.println("Input Wrong!!");
            }
        } while (true);
//              do {
//                  System.out.println("Enter id");
//                  id=scanner.nextLine();
//              }while (CustomerValidate.checkIdCustomer1(id));

//        System.out.println(id);
        try {
            int index = customerRepository.searchIdCustomer(id);
            if (index == -1) {
                System.out.println("Enter name of customer:");
                String name = Validate.validateNameAndType();
                System.out.println("Enter day of birth customer");
                String date = Validate.validateDate();
                System.out.println("Enter gender of customer");
                String gender = Validate.validateGender();
                System.out.println("Enter identify of customer");
                String identify = Validate.validateIdentifyNumber();
                System.out.println("Enter phone number of customer");
                String phoneNumber = Validate.validatePhoneNumber();
                System.out.println("Enter email of customer");
                String email = Validate.validateEmail();
                System.out.println("Enter level of customer");
                String kindOfCustomer = Validate.ValidateKindOfCustomer();
                System.out.println("Enter address of customer");
                String addressCustomer = scanner.nextLine();
                Customer customer = new Customer(id, name, date, gender, identify, phoneNumber, email, kindOfCustomer, addressCustomer);
                customerRepository.addNewCustomer(customer);
            } else {
                throw new UniqueIdException();
            }
        } catch (UniqueIdException e) {
            System.out.println("Id already exist!!");
        }
    }

    @Override
    public void editCustomer() {
        boolean flag = true;
        try {
            System.out.println("Enter id you want to edit");
            String id = Validate.validateIdCustomer();
            int index = customerRepository.searchIdCustomer(id);
            if (index == -1) {
                throw new IdNotFoundException("Id doesnt exist!!!");
            } else {
                Customer customer = customerRepository.getCustomer(index);
                do {
                    System.out.println("Enter info you want to edit" +
                            "\n1.Edit name" +
                            "\n2.Edit date" +
                            "\n3.Edit gender" +
                            "\n4.Edit identify" +
                            "\n5.Edit phoneNumber" +
                            "\n6.Edit email" +
                            "\n7.Edit kind of customer" +
                            "\n8.Edit address of customer" +
                            "\n9.Save info");
                    int select = ReadAndWrite.inputInput();
                    switch (select) {
                        case 1:
                            System.out.println("New name");
                            String name = Validate.validateNameAndType();
                            customer.setName(name);
                            break;
                        case 2:
                            System.out.println("New date");
                            String date = Validate.validateDate();
                            customer.setDate(date);
                            break;
                        case 3:
                            System.out.println("New gender");
                            String gender = Validate.validateGender();
                            customer.setGender(gender);
                            break;
                        case 4:
                            System.out.println("New identify");
                            String identify = Validate.validateIdentifyNumber();
                            customer.setIdentifyNumber(identify);
                            break;
                        case 5:
                            System.out.println("New phone number");
                            String phoneNumber = Validate.validatePhoneNumber();
                            customer.setPhoneNumber(phoneNumber);
                            break;
                        case 6:
                            System.out.println("New email");
                            String email = Validate.validateEmail();
                            customer.setEmail(email);
                            break;
                        case 7:
                            System.out.println("New kind of customer");
                            String kindOfCustomer = Validate.ValidateKindOfCustomer();
                            customer.setKindOfCustomer(kindOfCustomer);
                            break;
                        case 8:
                            System.out.println("New address of customer");
                            String address = scanner.nextLine();
                            customer.setAddressCustomer(address);
                            break;
                        case 9:
                            flag = false;
                            break;
                        default:
                            System.out.println("Input Wrong");
                            break;
                    }
                } while (flag);
                System.out.println("Enter yes to save info");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    customerRepository.editCustomer(index, customer);
                } else {
                    System.out.println("Cancel!!!");
                }
            }

        } catch (IdNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public void removeCustomer() {
        try {
            System.out.println("Enter id you want to remove");
            String id = Validate.validateIdCustomer();
            int index = customerRepository.searchIdCustomer(id);
            if (index == -1) {
                throw new IdNotFoundException("Id doesnt exist!!!");
            } else {
                System.out.println(customerRepository.getCustomer(index));
                System.out.println("Enter yes if you want to remove this customer");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    customerRepository.removeCustomer(index);
                } else {
                    System.out.println("Cancel!!!");
                }
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void searchCustomerByName() {
        System.out.println("Enter name you want to search");
        String name = scanner.nextLine();
        List<Customer> customerList = customerRepository.searchByNameCustomer(name);
        if (customerList.size() == 0) {
            System.out.println("Name doest exist!!!");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
}
