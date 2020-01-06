package iterator;

import iterator.menus.Menu;
import iterator.menus.MenuItem;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.List;

@Slf4j
public class Waitress {

    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            print(menu.createIterator());
            log.info("========================================================");
        }
    }

    private void print(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            log.info(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
    }

}