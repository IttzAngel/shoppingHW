package shopping;

public class Business implements Discountable{

    private String address;
    private Product product;
    private final double DISCOUNT = .25;



    @Override
    public double calculateDiscount() {
        return 0;
    }
}
