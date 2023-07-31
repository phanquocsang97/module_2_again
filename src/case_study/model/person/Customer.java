package case_study.model.person;

public class Customer extends Person{
    private String idCustomer;
    private String kindOfCustomer;
    private String addressCustomer;

    public Customer() {
    }


    public Customer(String idCustomer, String name, String date, String gender, String identifyNumber, String phoneNumber, String email, String kindOfCustomer, String addressCustomer) {
        super(name, date, gender, identifyNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.kindOfCustomer = kindOfCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }
    public String convertToStringCustomer(){
        return idCustomer + "," + name + "," + date + "," + gender + "," + identifyNumber + "," +
                phoneNumber + "," + email + "," + kindOfCustomer + "," + addressCustomer;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", identifyNumber='" + identifyNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
