package strategy;

import lombok.extern.slf4j.Slf4j;
import strategy.ducks.DecoyDuck;
import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.fly.behavior.FlyRocketPowered;

@Slf4j
public class MiniDuckSimulator {

    public static void main(String[] args) {
        log.info("==========================================");

        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        log.info("==========================================");

        Duck decoy = new DecoyDuck();

        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        log.info("==========================================");

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.display();
        mallard.performFly();
        log.info("==========================================");

    }

}