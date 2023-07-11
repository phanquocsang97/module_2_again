package ss7_abstract_class_interface.book_model;

public class SocialBook extends Book {
    private String authorBook;

    public SocialBook() {
    }

    public SocialBook(int idBook, String nameBook, int yearBook, String authorBook) {
        super(idBook, nameBook, yearBook);
        this.authorBook = authorBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String convertToStringSocialBook() {
        return this.convertToStringBook() + "," + authorBook;
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "idBook=" + this.getIdBook() +
                ", nameBook='" + this.getNameBook() + '\'' +
                ", yearBook=" + this.getYearBook() +
                "authorBook='" + authorBook + '\'' +
                '}';
    }
}
