package shopping;

public class Product {

    private String description;
    private double price;
    private Size size;

    public Product(String description, double price, Size size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }
}
