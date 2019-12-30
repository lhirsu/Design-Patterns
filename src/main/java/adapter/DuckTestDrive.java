package adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuckTestDrive {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyActingAsADuck = new TurkeyAdapter(turkey);

        log.info("The duck says..");
        simulate(duck);

        log.info("The turkey says..");
        turkey.gobble();
        turkey.fly();

        log.info("The turkey acting like a duck says..");
        simulate(turkeyActingAsADuck);

    }

    public static void simulate(Duck duck) {
        duck.quack();
        duck.fly();
    }

}