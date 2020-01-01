package factory.factoryMethodPattern;

import factory.factoryMethodPattern.pizza.Pizza;
import factory.factoryMethodPattern.store.ChicagoStylePizzaStore;
import factory.factoryMethodPattern.store.NYStylePizzaStore;
import factory.factoryMethodPattern.store.PizzaStore;
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