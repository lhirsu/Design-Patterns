package factory.abstractFactoryPattern;

import factory.abstractFactoryPattern.store.ChicagoStylePizzaStore;
import factory.abstractFactoryPattern.store.NYStylePizzaStore;
import factory.abstractFactoryPattern.store.PizzaStore;
import factory.abstractFactoryPattern.pizza.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        log.info("==================================================");
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        log.info("Ethan ordered a " + nyCheesePizza.getName() + "\n");
        log.info("==================================================");
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        log.info("Joel ordered a " + chicagoCheesePizza.getName() + "\n");
        log.info("==================================================");

    }

}