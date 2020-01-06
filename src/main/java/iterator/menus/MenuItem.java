package iterator.menus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MenuItem {

    private String name;
    private String description;
    private Double price;
    private Boolean vegetarian;

}