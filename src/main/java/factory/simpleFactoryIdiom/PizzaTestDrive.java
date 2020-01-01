package factory.simpleFactoryIdiom;

import factory.simpleFactoryIdiom.pizza.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        log.info("========================");
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        log.info("Ethan ordered a " + cheesePizza.getName() + "\n");
        log.info("========================");
        Pizza clamPizza = pizzaStore.orderPizza("clam");
        log.info("Joel ordered a " + clamPizza.getName() + "\n");
        log.info("========================");

    }

}