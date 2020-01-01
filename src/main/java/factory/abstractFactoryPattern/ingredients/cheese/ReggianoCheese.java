package factory.abstractFactoryPattern.ingredients.cheese;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReggianoCheese implements Cheese {

    public ReggianoCheese() {
        log.info("Using Reggiano Cheese");
    }

}