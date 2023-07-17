package ss14_sort.expense_model;

public class Expense implements Comparable<Expense> {
    private int idExpense;
    private String nameExpense;
    private String dayExpense;
    private int priceExpense;
    private String detailExpense;

    public Expense() {
    }

    public Expense(int idExpense, String nameExpense, String dayExpense, int priceExpense, String detailExpense) {
        this.idExpense = idExpense;
        this.nameExpense = nameExpense;
        this.dayExpense = dayExpense;
        this.priceExpense = priceExpense;
        this.detailExpense = detailExpense;
    }

    public int getIdExpense() {
        return idExpense;
    }

    public void setIdExpense(int idExpense) {
        this.idExpense = idExpense;
    }

    public String getNameExpense() {
        return nameExpense;
    }

    public void setNameExpense(String nameExpense) {
        this.nameExpense = nameExpense;
    }

    public String getDayExpense() {
        return dayExpense;
    }

    public void setDayExpense(String dayExpense) {
        this.dayExpense = dayExpense;
    }

    public int getPriceExpense() {
        return priceExpense;
    }

    public void setPriceExpense(int priceExpense) {
        this.priceExpense = priceExpense;
    }

    public String getDetailExpense() {
        return detailExpense;
    }

    public void setDetailExpense(String detailExpense) {
        this.detailExpense = detailExpense;
    }
    public String convertToStringExpense(){
        return idExpense + "," + nameExpense + "," +
                dayExpense + "," + priceExpense + "," + detailExpense;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "idExpense='" + idExpense + '\'' +
                ", nameExpense='" + nameExpense + '\'' +
                ", dayExpense='" + dayExpense + '\'' +
                ", priceExpense=" + priceExpense +
                ", detailExpense='" + detailExpense + '\'' +
                '}';
    }

    @Override
    public int compareTo(Expense o) {
        return this.getNameExpense().compareTo(o.getNameExpense());
    }
}
