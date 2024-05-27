package patterns.structural.decorator;

// BakeryDecorator.java
public abstract class BakeryDecorator implements BakeryItem {
    protected BakeryItem bakeryItem;

    public BakeryDecorator(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }

    @Override
    public String getDescription() {
        return bakeryItem.getDescription();
    }

    @Override
    public double cost() {
        return bakeryItem.cost();
    }
}

