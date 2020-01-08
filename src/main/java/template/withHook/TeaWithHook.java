package template.withHook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        log.info("Steeping the tea");
    }

    @Override
    void addCondiments() {
        log.info("Adding Lemon");
    }

}