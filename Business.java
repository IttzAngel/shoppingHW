package shopping;

public class Business implements Discountable{

    private String address;
    private Product product;
    private final double DISCOUNT = .25;

    public Business(String address, Product product) {
        this.address = address;
        this.product = product;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
