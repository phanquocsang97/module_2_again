package ss12_java_collection.fruit_service;

import ss12_java_collection.fruit_model.Fruit;
import ss12_java_collection.fruit_repository.FruitRepository;
import ss12_java_collection.fruit_repository.IFruitRepository;

import java.util.*;

import static ss12_java_collection.fruit_view.Run.scanner;

public class FruitService implements IFruitService {
    IFruitRepository fruitRepository = new FruitRepository();

    @Override
    public void displayFruit() {
        Map<String, Fruit> fruitMap = fruitRepository.displayFruit();
        for (Map.Entry<String, Fruit> m : fruitMap.entrySet()) {
            System.out.println(m);
        }
    }

    @Override
    public void addNewFruit() {
        System.out.println("Enter name fruit");
        String newName = scanner.nextLine();
        System.out.println("Enter kind of fruit");
        String newKindOfFruit = scanner.nextLine();
        System.out.println("Enter day of manufacture");
        String newOfManuFactureFruit = scanner.nextLine();
        System.out.println("Enter expiry of fruit");
        String newExpireFruit = scanner.nextLine();
        System.out.println("Enter price fruit");
        int newPrice = Integer.parseInt(scanner.nextLine());
        Fruit fruit = new Fruit(newName, newKindOfFruit, newOfManuFactureFruit, newExpireFruit, newPrice);
        fruitRepository.addNewFruit(fruit);
    }

    @Override
    public void removeFruit() {
        System.out.println("Enter id fruit you want to remove");
        String keyFruit = scanner.nextLine();
        Fruit fruit = fruitRepository.searchIdFruit(keyFruit);
        if (fruit == null) {
            System.out.println("Id doest exist!!");
        } else {
            fruitRepository.removeFruit(keyFruit, fruit);
        }
    }

    @Override
    public void editFruit() {
        boolean flag = true;
        System.out.println("Enter id fruit you want to edit");
        String keyFruit = scanner.nextLine();
        Fruit fruit = fruitRepository.searchIdFruit(keyFruit);
        if (fruit == null) {
            System.out.println("Id doesnt exist");
        } else {
            System.out.println();
            do {
                System.out.println("Enter info you want to edit");
                System.out.println("1.Name fruit" +
                        "\n2.Kind of fruit" +
                        "\n3.Day of manufacture fruit" +
                        "\n4.Expire of fruit" +
                        "\n5.Price of fruit" +
                        "\n6.Save"
                );
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        System.out.println("New name fruit");
                        String newName = scanner.nextLine();
                        fruit.setNameFruit(newName);
                        break;
                    case 2:
                        System.out.println("New kind of fruit");
                        String newKindOfFruit = scanner.nextLine();
                        fruit.setKindOfFruit(newKindOfFruit);
                        break;
                    case 3:
                        System.out.println("New day of manufacture fruit");
                        String newDayOfManufacture = scanner.nextLine();
                        fruit.setDayOfManufactureFruit(newDayOfManufacture);
                        break;
                    case 4:
                        System.out.println("New expire of fruit");
                        String newExpire = scanner.nextLine();
                        fruit.setExpiryOfFruit(newExpire);
                        break;
                    case 5:
                        System.out.println("New price of fruit");
                        int newPrice = Integer.parseInt(scanner.nextLine());
                        fruit.setPriceOfFruit(newPrice);
                        break;
                    case 6:
                        System.out.println("Save info fruit");
                        flag = false;
                        break;
                }
            } while (flag);
            System.out.println("Enter yes to save");
            String choice = scanner.nextLine().toLowerCase().trim();
            if (choice.equals("yes")) {
                fruitRepository.editFruit(keyFruit, fruit);
                displayFruit();
            } else {
                System.out.println("Cancel!!");
            }
        }
    }
}
