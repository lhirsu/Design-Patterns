package decorator.beverages;

public class DarkRoast extends Beverage {

    // Classes should be open for extension but closed for modification
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.55;
    }

}