package factory.abstractFactoryPattern.ingredientFactory;

import factory.abstractFactoryPattern.ingredients.cheese.Cheese;
import factory.abstractFactoryPattern.ingredients.clams.Clams;
import factory.abstractFactoryPattern.ingredients.dough.Dough;
import factory.abstractFactoryPattern.ingredients.pepperoni.Pepperoni;
import factory.abstractFactoryPattern.ingredients.sauce.Sauce;
import factory.abstractFactoryPattern.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

}