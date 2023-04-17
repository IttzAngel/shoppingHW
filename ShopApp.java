package shopping;

public class ShopApp {


    public static void main(String[] args) {

        Product shirt = new Product("Red T-Shirt", 10.0, Size.SMALL);
        Product pants = new Product("Track Pants", 10.0, Size.MEDIUM);
        Product shoes = new Product("Running Shoes", 10.0, Size.LARGE);

        Manager manager = new Manager();
        Student student = new Student(203927);
        Business business = new Business("123 Fish St", shirt);




    }

}
