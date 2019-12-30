package decorator.factory;

import decorator.beverages.Beverage;

public abstract class AbstractBeverageFactory {

    public abstract Beverage createExpresso();

    public abstract Beverage createExtraMochaCoffee();

    public abstract Beverage create3in1Coffee();

    // other types here

}