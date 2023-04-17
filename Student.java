package shopping;

public class Student extends Customer{

    private long studentID;
    private final double DISCOUNT = .05;


    @Override
    public double calculateDiscount() {
        return 0;
    }
}
