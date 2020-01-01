package factory.abstractFactoryPattern.store;

import factory.abstractFactoryPattern.ingredientFactory.NYPizzaIngredientFactory;
import factory.abstractFactoryPattern.ingredientFactory.PizzaIngredientFactory;
import factory.abstractFactoryPattern.pizza.*;
import factory.abstractFactoryPattern.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(nyPizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(nyPizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(nyPizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(nyPizzaIngredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            default:
                throw new IllegalArgumentException("Cannot create " + type + " pizza!");
        }

        return pizza;
    }

}