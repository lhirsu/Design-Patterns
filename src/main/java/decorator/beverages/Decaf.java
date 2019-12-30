package decorator.beverages;

public class Decaf extends Beverage {

    // Classes should be open for extension but closed for modification
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0.8;
    }
}