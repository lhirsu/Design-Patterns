package factory.abstractFactoryPattern.store;

import factory.abstractFactoryPattern.ingredientFactory.ChicagoPizzaIngredientFactory;
import factory.abstractFactoryPattern.ingredientFactory.PizzaIngredientFactory;
import factory.abstractFactoryPattern.pizza.*;
import factory.abstractFactoryPattern.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(chicagoPizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(chicagoPizzaIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(chicagoPizzaIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(chicagoPizzaIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            default:
                throw new IllegalArgumentException("Cannot create " + type + " pizza!");
        }

        return pizza;
    }

}