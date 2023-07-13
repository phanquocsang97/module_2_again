package ss12_java_collection.fruit_controller;

import ss12_java_collection.fruit_service.FruitService;
import ss12_java_collection.fruit_service.IFruitService;

import static ss12_java_collection.fruit_view.Run.scanner;

public class FruitController {
    IFruitService fruitService = new FruitService();
    public void displayMenu(){
        do {
            System.out.println("FRUIT MANAGEMENT" +
                    "\n1.Display list fruit" +
                    "\n2.Add new fruit" +
                    "\n3.Remove a fruit" +
                    "\n4.Edit a fruit" +
                    "\n5.Exit Program"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Display list fruit");
                    fruitService.displayFruit();
                    break;
                case 2:
                    System.out.println("Add new fruit");
                    fruitService.addNewFruit();
                    break;
                case 3:
                    System.out.println("Remove a fruit");
                    fruitService.removeFruit();
                    break;
                case 4:
                    System.out.println("Edit a fruit");
                    fruitService.editFruit();
                    break;
                case 5:
                    System.out.println("Exit Program");
                    System.exit(0);
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }

        }while (true);

    }
}
