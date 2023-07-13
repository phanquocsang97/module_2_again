package ss10_list.fruit_controller;

import ss10_list.fruit_service.FruitService;
import ss10_list.fruit_service.IFruitService;
import ss10_list.fruit_utils.ReadAndWrite;

public class FruitController {
    IFruitService fruitService = new FruitService();

    public void displayMenu() {
        do {
            System.out.println("FRUIT MANAGEMENT" +
                    "\n1.Display list fruit" +
                    "\n2.Add new fruit" +
                    "\n3.Exit Program"
            );
            int choose = ReadAndWrite.inputInt();
            switch (choose) {
                case 1:
                    System.out.println("Display list fruit");
                    fruitService.displayFruit();
                    break;
                case 2:
                    System.out.println("Add new fruit");
                    fruitService.addNewFruit();
                    break;
                case 3:
                    System.out.println("Exit Program");
                    System.exit(0);
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        } while (true);
    }
}
