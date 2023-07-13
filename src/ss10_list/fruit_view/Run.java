package ss10_list.fruit_view;

import ss10_list.fruit_controller.FruitController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FruitController fruitController = new FruitController();
        fruitController.displayMenu();

    }
}
