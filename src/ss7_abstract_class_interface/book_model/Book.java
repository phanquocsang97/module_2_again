package ss7_abstract_class_interface.book_model;

public abstract class Book {
    private int idBook;
    private String nameBook;
    private int yearBook;

    public Book() {
    }

    public Book(int idBook, String nameBook, int yearBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.yearBook = yearBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public String convertToStringBook(){
        return idBook + "," + nameBook + "," + yearBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", yearBook=" + yearBook +
                '}';
    }
}
