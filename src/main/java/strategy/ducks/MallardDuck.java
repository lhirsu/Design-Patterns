package strategy.ducks;

import lombok.extern.slf4j.Slf4j;
import strategy.fly.behavior.FlyWithWings;
import strategy.quack.behavior.Quack;

@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("I'm a real Mallard Duck");
    }

}
