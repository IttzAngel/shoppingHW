package shopping;

public class Student extends Customer{

    private long studentID;
    private final double DISCOUNT = .05;

    public Student(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
