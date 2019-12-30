package decorator.factory;

import decorator.beverages.Beverage;
import decorator.beverages.DarkRoast;
import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;

public class BeverageFactory extends AbstractBeverageFactory {

    @Override
    public Beverage createExpresso() {
        return new Expresso();
    }

    @Override
    public Beverage createExtraMochaCoffee() {
        return new Whip(new Mocha(new Mocha(new DarkRoast())));
    }

    @Override
    public Beverage create3in1Coffee() {
        return new Whip(new Mocha(new Soy(new HouseBlend())));
    }

}