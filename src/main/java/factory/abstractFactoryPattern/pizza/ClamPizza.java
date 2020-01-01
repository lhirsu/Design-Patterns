package factory.abstractFactoryPattern.pizza;

import factory.abstractFactoryPattern.ingredientFactory.PizzaIngredientFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        log.info("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clams = pizzaIngredientFactory.createClams();
    }

}