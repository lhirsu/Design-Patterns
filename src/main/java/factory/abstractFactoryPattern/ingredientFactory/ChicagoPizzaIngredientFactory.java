package factory.abstractFactoryPattern.ingredientFactory;

import factory.abstractFactoryPattern.ingredients.cheese.Cheese;
import factory.abstractFactoryPattern.ingredients.cheese.MozzarellaCheese;
import factory.abstractFactoryPattern.ingredients.clams.Clams;
import factory.abstractFactoryPattern.ingredients.clams.FrozenClams;
import factory.abstractFactoryPattern.ingredients.dough.Dough;
import factory.abstractFactoryPattern.ingredients.dough.ThickCrustDough;
import factory.abstractFactoryPattern.ingredients.pepperoni.Pepperoni;
import factory.abstractFactoryPattern.ingredients.pepperoni.SlicedPepperoni;
import factory.abstractFactoryPattern.ingredients.sauce.PlumTomatoSauce;
import factory.abstractFactoryPattern.ingredients.sauce.Sauce;
import factory.abstractFactoryPattern.ingredients.veggies.Mushroom;
import factory.abstractFactoryPattern.ingredients.veggies.Onion;
import factory.abstractFactoryPattern.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() { return new ThickCrustDough(); }

    @Override
    public Sauce createSauce() { return new PlumTomatoSauce(); }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Mushroom()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

}