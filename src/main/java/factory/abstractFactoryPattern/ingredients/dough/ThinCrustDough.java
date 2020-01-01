package factory.abstractFactoryPattern.ingredients.dough;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThinCrustDough implements Dough {

    public ThinCrustDough() {
        log.info("Using Thin Crust Dough");
    }

}