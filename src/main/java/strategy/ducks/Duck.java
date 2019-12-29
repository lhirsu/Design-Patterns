package strategy.ducks;

import lombok.extern.slf4j.Slf4j;
import strategy.fly.behavior.FlyBehavior;
import strategy.quack.behavior.QuackBehavior;

@Slf4j
public abstract class Duck {

    // favor composition over inheritance
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    // program to interfaces, not implementations
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        log.info("All ducks float, even decoys!");
    }

    public abstract void display();

}