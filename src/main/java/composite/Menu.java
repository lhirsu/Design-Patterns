package composite;

import composite.iterators.CompositeIterator;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList = new ArrayList<>();
    private String name;
    private String description;
    private Iterator iterator = null;

    Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponentList.iterator());
        }

        return iterator;
    }

    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        log.info(" " + getName() + ", " + getDescription());
        log.info("======================");
        menuComponentList.forEach(MenuComponent::print);
    }

}