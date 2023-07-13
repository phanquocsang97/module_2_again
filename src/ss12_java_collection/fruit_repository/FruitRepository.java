package ss12_java_collection.fruit_repository;

import ss12_java_collection.fruit_model.Fruit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FruitRepository implements IFruitRepository {
    private static Map<String, Fruit> fruitMap = new HashMap<>();
    private String keyFruit = "FR0";
    private static int id = 1;

    static {
        fruitMap.put("FR01", new Fruit("Mango", "Fresh", "11/7/2023", "20/7/2023", 1000));
        fruitMap.put("FR02", new Fruit("Apple", "Fresh", "12/7/2023", "21/7/2023", 1100));
        fruitMap.put("FR03", new Fruit("Orange", "Fresh", "13/7/2023", "22/7/2023", 1200));
        id = 4;
    }

    @Override
    public Map<String, Fruit> displayFruit() {
        return fruitMap;
    }

    @Override
    public void addNewFruit(Fruit fruit) {
        keyFruit = keyFruit + id;
        fruitMap.put(keyFruit, fruit);
        id++;
    }

    @Override
    public void removeFruit(String keySet, Fruit fruit) {
        fruitMap = displayFruit();
        fruitMap.remove(keySet, fruit);

    }

    @Override
    public void editFruit(String keySet, Fruit fruit) {
        fruitMap = displayFruit();
    }

    @Override
    public Fruit searchIdFruit(String keySet) {
        Set<String> strings = displayFruit().keySet();
        for (String s : strings) {
            if (s.equals(keySet)) {
                return displayFruit().get(s);
            }
        }
        return null;
    }
}
