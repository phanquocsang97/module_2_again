package ss10_list.fruit_repository;

import ss10_list.fruit_model.Fruit;

import java.util.List;

public interface IFruitRepository {
    List<Fruit> displayFruit();

    void addNewFruit(Fruit fruit);

    int searchNameFruit(String nameFruit);
}
