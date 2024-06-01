package patterns.behavioral.Iterator;

public class DinnerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Fake Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        // Add more items
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}