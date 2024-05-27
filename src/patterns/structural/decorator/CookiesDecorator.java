package patterns.structural.decorator;

// CookiesDecorator.java
public class CookiesDecorator extends BakeryDecorator {
    public CookiesDecorator(BakeryItem bakeryItem) {
        super(bakeryItem);
    }

    @Override
    public String getDescription() {
        return bakeryItem.getDescription() + ", with Cookies";
    }

    @Override
    public double cost() {
        return bakeryItem.cost() + 3.0;
    }
}


