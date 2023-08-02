package case_study.view;

import case_study.common.validate.EmployeeValidate;
import case_study.controller.FuramaController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMenu();
    }
}
