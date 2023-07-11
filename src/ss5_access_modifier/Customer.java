package ss5_access_modifier;

public class Customer {
    //    Cac thuoc tinh su dung access modifier private la the hien tinh bao dong
    private int id;
    private String name;
    private String location;
    private static String company = "CG";

    public Customer(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    //    su dung phuong thuc static de thay doi thuoc tinh cua lop ma khong can khoi tao doi tuong
      static void change() {
        company = "Codegym";
    }

    void display() {
        System.out.println(id + " " + name + " " + location + " " + company);
    }
}
