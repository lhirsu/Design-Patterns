package strategy.quack.behavior;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        log.info("Squeak");
    }
}
