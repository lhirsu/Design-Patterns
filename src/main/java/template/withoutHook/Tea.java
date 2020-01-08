package template.withoutHook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        log.info("Steeping the tea");
    }

    @Override
    void addCondiments() {
        log.info("Adding Lemon");
    }

}