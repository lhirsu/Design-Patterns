package composite;

import composite.iterators.NullIterator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

@AllArgsConstructor
@Slf4j
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private Boolean vegetarian;
    private Double price;

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        String veggieStatus = isVegetarian() ? " (v)" : "";
        log.info("  " + getName() + veggieStatus + ", " + getPrice() + " --- " + getDescription());
    }

}