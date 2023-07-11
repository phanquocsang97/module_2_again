package ss5_access_modifier;

public class Test {
    public static void main(String[] args) {
        Customer.change();
        Customer customer1 = new Customer(1, "A", "Boss");
        Customer customer2 = new Customer(2, "B", "Employee");
        Customer customer3 = new Customer(3, "C", "Employee");
        customer1.display();
        customer2.display();
        customer3.display();
    }
}
