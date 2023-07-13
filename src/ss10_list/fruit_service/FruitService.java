package ss10_list.fruit_service;

import ss10_list.fruit_model.Fruit;
import ss10_list.fruit_repository.FruitRepository;
import ss10_list.fruit_repository.IFruitRepository;
import ss10_list.fruit_utils.InputWrongNameFruit;
import ss10_list.fruit_utils.ReadAndWrite;
import ss10_list.fruit_utils.Regex;

import static ss10_list.fruit_view.Run.scanner;

public class FruitService implements IFruitService {
    IFruitRepository fruitRepository = new FruitRepository();

    @Override
    public void displayFruit() {
        for (Fruit fruit : fruitRepository.displayFruit()) {
            System.out.println(fruit);
        }
    }

    @Override
    public void addNewFruit() {
        String dayOfManufactureFruit;
        String expireFruit;
        do {
            try {
                System.out.println("Enter  fruit name");
                String nameFruit = scanner.nextLine();
                int index = fruitRepository.searchNameFruit(nameFruit);
                if (index == -1) {
                    System.out.println("Enter  kind of fruit");
                    String kindOfFruit = scanner.nextLine();
                    do {
                        System.out.println("Enter  day of manufacture fruit");
                        dayOfManufactureFruit = scanner.nextLine();
                    } while (!Regex.validateDay(dayOfManufactureFruit));
                    do {
                        System.out.println("Enter  expire of fruit");
                        expireFruit = scanner.nextLine();
                    } while (!Regex.validateDay(expireFruit));
                    System.out.println("Enter  price of fruit");
                    int priceFruit = ReadAndWrite.inputInt();
                    Fruit fruit = new Fruit(nameFruit, kindOfFruit, dayOfManufactureFruit, expireFruit, priceFruit);
                    fruitRepository.addNewFruit(fruit);
                    break;
                } else {
                    throw new InputWrongNameFruit();
                }
            } catch (InputWrongNameFruit e) {
                System.out.println("Name fruit is already exist!!");
            }
        } while (true);
    }
}
