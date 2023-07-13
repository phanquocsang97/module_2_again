package ss12_java_collection.fruit_repository;

import ss12_java_collection.fruit_model.Fruit;

import java.util.Map;

public interface IFruitRepository {
    Map<String, Fruit> displayFruit();
    void addNewFruit(Fruit fruit);
    void removeFruit(String keySet,Fruit fruit);
    void editFruit(String keySet, Fruit fruit);
    Fruit searchIdFruit(String keySet);

}
