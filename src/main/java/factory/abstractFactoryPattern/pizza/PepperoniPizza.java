package factory.abstractFactoryPattern.pizza;

import factory.abstractFactoryPattern.ingredientFactory.PizzaIngredientFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        log.info("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }

}