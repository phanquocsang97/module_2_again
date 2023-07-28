package case_study.furama_model.person;

public class Employee extends Person{
    private String idEmployee;
    private String levelEmployee;
    private String positionEmployee;
    private int salaryEmployee;

    public Employee() {
    }

    public Employee(String idEmployee, String name, String date, String gender, String identifyNumber, String phoneNumber, String email, String levelEmployee, String positionEmployee, int salaryEmployee) {
        super(name, date, gender, identifyNumber, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public int getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
    public String convertToStringEmployee(){
        return idEmployee + "," + name + "," + date + "," + gender + "," + identifyNumber + "," +
                phoneNumber + "," + email + "," + levelEmployee + "," + positionEmployee + "," + salaryEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", nameEmployee='" + name + '\'' +
                ", dateEmployee='" + date + '\'' +
                ", genderEmployee='" + gender + '\'' +
                ", identifyEmployee='" + identifyNumber + '\'' +
                ", phoneNumberEmployee='" + phoneNumber + '\'' +
                ", emailEmployee=" + email +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salaryEmployee='" + salaryEmployee + '\'' +
                '}';
    }
}
