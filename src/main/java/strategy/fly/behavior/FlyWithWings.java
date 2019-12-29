package strategy.fly.behavior;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        log.info("I'm flying");
    }
}
