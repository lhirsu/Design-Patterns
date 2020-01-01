package factory.abstractFactoryPattern.ingredients.dough;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThickCrustDough implements Dough {

    public ThickCrustDough() {
        log.info("Using Thick Crust Dough");
    }

}