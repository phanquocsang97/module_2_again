package ss12_java_collection.fruit_view;

import ss12_java_collection.fruit_controller.FruitController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FruitController fruitController = new FruitController();
        fruitController.displayMenu();
    }
}
