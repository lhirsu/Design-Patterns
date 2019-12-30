package adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        log.info("quack, quack!");
    }

    @Override
    public void fly() {
        log.info("I'm flying");
    }

}