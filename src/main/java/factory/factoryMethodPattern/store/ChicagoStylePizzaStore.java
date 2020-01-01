package factory.factoryMethodPattern.store;

import factory.factoryMethodPattern.pizza.Pizza;
import factory.factoryMethodPattern.pizza.chicago.ChicagoStyleCheesePizza;
import factory.factoryMethodPattern.pizza.chicago.ChicagoStyleClamPizza;
import factory.factoryMethodPattern.pizza.chicago.ChicagoStylePepperoniPizza;
import factory.factoryMethodPattern.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Cannot create " + type + " pizza!");
        }
    }

}