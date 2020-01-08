package template;

import lombok.extern.slf4j.Slf4j;
import template.withHook.CaffeineBeverageWithHook;
import template.withHook.CoffeeWithHook;
import template.withHook.TeaWithHook;
import template.withoutHook.CaffeineBeverage;
import template.withoutHook.Coffee;
import template.withoutHook.Tea;

@Slf4j
public class BeverageTestDrive {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        log.info("======= Making tea =======");
        tea.prepareRecipe();
        log.info("======= Making coffee =======");
        coffee.prepareRecipe();

        CaffeineBeverageWithHook teaHook = new TeaWithHook();
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();

        log.info("======= Making tea with hook =======");
        teaHook.prepareRecipe();
        log.info("======= Making coffee with hook =======");
        coffeeHook.prepareRecipe();

    }
}