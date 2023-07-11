package ss7_abstract_class_interface.book_view;

import ss7_abstract_class_interface.book_controller.BookController;

import java.util.Scanner;

public class View {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.displayMenuBook();
    }
}
