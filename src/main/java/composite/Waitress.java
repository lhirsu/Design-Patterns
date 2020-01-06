package composite;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

@Slf4j
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator menuIterator = allMenus.createIterator();

        log.info("==== VEGETARIAN MENU ====");
        while (menuIterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) menuIterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }

}