package factory.simpleFactoryIdiom;

import factory.simpleFactoryIdiom.pizza.Pizza;

public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type) {

        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}