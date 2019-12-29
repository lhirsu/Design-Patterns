package strategy.fly.behavior;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I'm flying with a rocket");
    }

}