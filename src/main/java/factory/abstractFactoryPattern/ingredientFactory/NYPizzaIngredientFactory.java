package factory.abstractFactoryPattern.ingredientFactory;

import factory.abstractFactoryPattern.ingredients.cheese.Cheese;
import factory.abstractFactoryPattern.ingredients.cheese.ReggianoCheese;
import factory.abstractFactoryPattern.ingredients.clams.Clams;
import factory.abstractFactoryPattern.ingredients.clams.FreshClams;
import factory.abstractFactoryPattern.ingredients.dough.Dough;
import factory.abstractFactoryPattern.ingredients.dough.ThinCrustDough;
import factory.abstractFactoryPattern.ingredients.pepperoni.Pepperoni;
import factory.abstractFactoryPattern.ingredients.pepperoni.SlicedPepperoni;
import factory.abstractFactoryPattern.ingredients.sauce.MarinaraSauce;
import factory.abstractFactoryPattern.ingredients.sauce.Sauce;
import factory.abstractFactoryPattern.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new RedPepper(), new Garlic(), new Mushroom()};
    }

    @Override
    public Pepperoni createPepperoni() { return new SlicedPepperoni(); }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

}