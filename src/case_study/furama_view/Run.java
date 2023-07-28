package case_study.furama_view;

import case_study.furama_common.validate.Validate;
import case_study.furama_controller.FuramaController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMenu();
    }
}
