package iterator;

import iterator.menus.CoffeeMenu;
import iterator.menus.DinnerMenu;
import iterator.menus.PancakeHouseMenu;

import java.util.Arrays;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CoffeeMenu caffeeMenu = new CoffeeMenu();

        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinnerMenu, caffeeMenu));
        waitress.printMenu();
    }

}