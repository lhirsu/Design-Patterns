package decorator.beverages;

public class Expresso extends Beverage {

    // Classes should be open for extension but closed for modification
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}