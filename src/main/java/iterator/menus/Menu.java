package iterator.menus;

import java.util.Iterator;

public interface Menu {

    Iterator createIterator();

    void addItem(String name, String description, Boolean vegetarian, Double price);

}