package strategy.ducks;

import lombok.extern.slf4j.Slf4j;
import strategy.fly.behavior.FlyNoWay;
import strategy.quack.behavior.MuteQuack;

@Slf4j
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        log.info("I'm just a Decoy");
    }

}
