package factory.simpleFactoryIdiom.pizza;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Dough";
        sauce = "Wine Sauce";
        toppings.add("Pepper topping");
    }

}