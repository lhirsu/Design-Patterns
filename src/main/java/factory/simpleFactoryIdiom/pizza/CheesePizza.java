package factory.simpleFactoryIdiom.pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}