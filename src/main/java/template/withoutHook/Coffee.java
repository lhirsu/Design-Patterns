package template.withoutHook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        log.info("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        log.info("Adding Sugar and Milk");
    }

}
