public class Product {
    private int ID;
    private String brand;
    private String name;
    private float price;

    public Product() {
        this.ID = 0;
        this.brand = "";
        this.name = "";
        this.price = 0;
    }

    public Product(int ID, String brand, String name, float price) {
        this.ID = ID;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inventory Number: " + this.ID
        + '\'' + "Brand: " + this.brand + '\'' + "Name: " + this.name
                + '\'' + "Price: " + this.price;
    }

}
