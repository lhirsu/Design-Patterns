package factory.factoryMethodPattern.store;

import factory.factoryMethodPattern.pizza.Pizza;
import factory.factoryMethodPattern.pizza.ny.NYStyleCheesePizza;
import factory.factoryMethodPattern.pizza.ny.NYStyleClamPizza;
import factory.factoryMethodPattern.pizza.ny.NYStylePepperoniPizza;
import factory.factoryMethodPattern.pizza.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Cannot create " + type + " pizza!");
        }
    }

}