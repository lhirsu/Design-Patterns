package factory.abstractFactoryPattern.ingredients.sauce;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MarinaraSauce implements Sauce {

    public MarinaraSauce() {
        log.info("Using Marinara Sauce");
    }

}