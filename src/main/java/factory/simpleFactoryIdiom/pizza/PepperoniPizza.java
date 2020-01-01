package factory.simpleFactoryIdiom.pizza;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Thick Crust Dough";
        sauce = "Pepperoni Sauce";
        toppings.add("Pepperoni topping");
    }

}