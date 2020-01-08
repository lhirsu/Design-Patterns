package template.withHook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        if (customerWantsCondiments()) {
            addCondiments();
        }
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

    // this is a hook method, subclasses can override this method, but don't have to.
    boolean customerWantsCondiments() {
        return true;
    }

}
