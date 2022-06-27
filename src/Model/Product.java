package Model;

public class Product {
    private String Name;
    private int Price;
    private int Quality;

    private int CatedgoryId;

    public Product(String name, int price, int quality, int catedgoryId) {
        Name = name;
        Price = price;
        Quality = quality;
        CatedgoryId = catedgoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getCatedgoryId() {
        return CatedgoryId;
    }

    public void setCatedgoryId(int catedgoryId) {
        CatedgoryId = catedgoryId;
    }
}
