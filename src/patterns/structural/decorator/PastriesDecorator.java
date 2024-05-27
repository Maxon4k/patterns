package patterns.structural.decorator;

// PastriesDecorator.java
public class PastriesDecorator extends BakeryDecorator {
    public PastriesDecorator(BakeryItem bakeryItem) {
        super(bakeryItem);
    }

    @Override
    public String getDescription() {
        return bakeryItem.getDescription() + ", with Pastries";
    }

    @Override
    public double cost() {
        return bakeryItem.cost() + 5.0;
    }
}
