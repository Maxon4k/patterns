package patterns.behavioral.Iterator;

public class Waitress {
    private Menu dinnerMenu;

    public Waitress(Menu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n----\nDINNER");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}