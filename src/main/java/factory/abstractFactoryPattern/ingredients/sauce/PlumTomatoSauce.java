package factory.abstractFactoryPattern.ingredients.sauce;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlumTomatoSauce implements Sauce {

    public PlumTomatoSauce() {
        log.info("Using Plum Tomato Sauce");
    }

}