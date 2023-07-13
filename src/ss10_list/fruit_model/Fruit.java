package ss10_list.fruit_model;

public class Fruit {
    private String nameFruit;
    private String kindOfFruit;
    private String dayOfManufactureFruit;
    private String expiryOfFruit;
    private int priceOfFruit;

    public Fruit() {
    }

    public Fruit(String nameFruit, String kindOfFruit, String dayOfManufactureFruit, String expiryOfFruit, int priceOfFruit) {
        this.nameFruit = nameFruit;
        this.kindOfFruit = kindOfFruit;
        this.dayOfManufactureFruit = dayOfManufactureFruit;
        this.expiryOfFruit = expiryOfFruit;
        this.priceOfFruit = priceOfFruit;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getKindOfFruit() {
        return kindOfFruit;
    }

    public void setKindOfFruit(String kindOfFruit) {
        this.kindOfFruit = kindOfFruit;
    }

    public String getDayOfManufactureFruit() {
        return dayOfManufactureFruit;
    }

    public void setDayOfManufactureFruit(String dayOfManufactureFruit) {
        this.dayOfManufactureFruit = dayOfManufactureFruit;
    }

    public String getExpiryOfFruit() {
        return expiryOfFruit;
    }

    public void setExpiryOfFruit(String expiryOfFruit) {
        this.expiryOfFruit = expiryOfFruit;
    }

    public int getPriceOfFruit() {
        return priceOfFruit;
    }

    public void setPriceOfFruit(int priceOfFruit) {
        this.priceOfFruit = priceOfFruit;
    }

    public String convertToStringFruit() {
        return nameFruit + "," + kindOfFruit + "," + dayOfManufactureFruit +
                "," + expiryOfFruit + "," + priceOfFruit;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", kindOfFruit='" + kindOfFruit + '\'' +
                ", dayOfManufactureFruit=" + dayOfManufactureFruit +
                ", expiryOfFruit=" + expiryOfFruit +
                ", priceOfFruit=" + priceOfFruit +
                '}';
    }
}
