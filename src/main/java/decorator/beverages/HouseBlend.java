package decorator.beverages;

public class HouseBlend extends Beverage {

    // Classes should be open for extension but closed for modification
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.95;
    }

}