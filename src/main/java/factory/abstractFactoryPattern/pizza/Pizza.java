package factory.abstractFactoryPattern.pizza;

import factory.abstractFactoryPattern.ingredients.cheese.Cheese;
import factory.abstractFactoryPattern.ingredients.clams.Clams;
import factory.abstractFactoryPattern.ingredients.dough.Dough;
import factory.abstractFactoryPattern.ingredients.pepperoni.Pepperoni;
import factory.abstractFactoryPattern.ingredients.sauce.Sauce;
import factory.abstractFactoryPattern.ingredients.veggies.Veggies;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        log.info("Bake for 25 minutes at 220 Celsius degrees");
    }

    public void cut() {
        log.info("Cutting the pizza into diagonal slices");
    }

    public void box() {
        log.info("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}