package factory.simpleFactoryIdiom.pizza;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Arugula");
    }

}