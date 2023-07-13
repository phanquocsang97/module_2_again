package ss10_list.fruit_repository;

import ss10_list.fruit_model.Fruit;
import ss10_list.fruit_utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FruitRepository implements IFruitRepository {
    @Override
    public List<Fruit> displayFruit() {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_FRUIT);
        List<Fruit> fruitList = new ArrayList<>();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            fruitList.add(new Fruit(info[0], info[1], info[2], info[3], Integer.parseInt(info[4])));
        }
        return fruitList;
    }

    @Override
    public void addNewFruit(Fruit fruit) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_FRUIT);
        stringList.add(fruit.convertToStringFruit());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_FRUIT, stringList, false);
    }

    public int searchNameFruit(String nameFruit) {
        for (int i = 0; i < displayFruit().size(); i++) {
            if (Objects.equals(displayFruit().get(i).getNameFruit(), nameFruit)) {
                return i;
            }
        }
        return -1;
    }
}
