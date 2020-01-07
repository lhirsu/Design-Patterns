package composite;

public class MenuTestDrive {

    public static void main(String[] args) {
        SimpleMenuFactory simpleMenuFactory = new SimpleMenuFactory();

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(simpleMenuFactory.createPancakeHouseMenu());
        allMenus.add(simpleMenuFactory.createDinerMenu());
        allMenus.add(simpleMenuFactory.createCoffeeMenu());

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

        waitress.printVegetarianMenu();

    }

}