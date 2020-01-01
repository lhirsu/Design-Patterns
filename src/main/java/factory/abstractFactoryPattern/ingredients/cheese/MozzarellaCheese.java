package factory.abstractFactoryPattern.ingredients.cheese;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese() {
        log.info("Using Mozzarella Cheese");
    }

}
