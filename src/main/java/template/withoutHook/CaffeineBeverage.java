package template.withoutHook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        log.info("Boiling water");
    }

    final void pourInCup() {
        log.info("Pouring into cup");
    }

}