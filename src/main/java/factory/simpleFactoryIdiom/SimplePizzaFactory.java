package factory.simpleFactoryIdiom;

import factory.simpleFactoryIdiom.pizza.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "clam":
                return new ClamPizza();
            case "veggie":
                return new VeggiePizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Cannot create " + type + " pizza!");
        }
    }

}