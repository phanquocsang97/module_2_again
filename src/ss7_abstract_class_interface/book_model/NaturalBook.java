package ss7_abstract_class_interface.book_model;

public class NaturalBook extends Book {
    private int amountBook;

    public NaturalBook() {
    }

    public NaturalBook(int amountBook) {
        this.amountBook = amountBook;
    }

    public NaturalBook(int idBook, String nameBook, int yearBook, int amountBook) {
        super(idBook, nameBook, yearBook);
        this.amountBook = amountBook;
    }

    public int getAmountBook() {
        return amountBook;
    }

    public void setAmountBook(int amountBook) {
        this.amountBook = amountBook;
    }

    public String convertToStringNaturalBook() {
        return this.convertToStringBook() + "," + amountBook;
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "idBook=" + this.getIdBook() +
                ", nameBook='" + this.getNameBook() + '\'' +
                ", yearBook=" + this.getYearBook() +
                ", amountBook=" + amountBook +
                '}';
    }
}
