package strategy.ducks;

import lombok.extern.slf4j.Slf4j;
import strategy.ducks.Duck;
import strategy.fly.behavior.FlyWithWings;
import strategy.quack.behavior.Quack;

@Slf4j
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("I'm a real RedheadDuck");
    }

}
