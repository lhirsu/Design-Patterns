package strategy.ducks;

import lombok.extern.slf4j.Slf4j;
import strategy.ducks.Duck;
import strategy.fly.behavior.FlyNoWay;
import strategy.quack.behavior.Squeak;

@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        log.info("I'm a RubberDuck");
    }

}
