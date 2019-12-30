package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.DarkRoast;
import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;
import decorator.factory.AbstractBeverageFactory;
import decorator.factory.BeverageFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage1 = new Expresso();
        printBeverage(beverage1);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        printBeverage(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(new Mocha(new Soy(beverage3)));
        printBeverage(beverage3);

        AbstractBeverageFactory beverageFactory = new BeverageFactory();

        Beverage expresso = beverageFactory.createExpresso();
        Beverage extraMochaCoffee = beverageFactory.createExtraMochaCoffee();
        Beverage coffee3in1 = beverageFactory.create3in1Coffee();

        printBeverage(expresso);
        printBeverage(extraMochaCoffee);
        printBeverage(coffee3in1);
    }

    public static void printBeverage(Beverage beverage) {
        log.info(beverage.getDescription() + " $" + beverage.cost());
    }

}