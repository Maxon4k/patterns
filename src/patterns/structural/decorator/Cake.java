package patterns.structural.decorator;

// Cake.java
public class Cake implements BakeryItem {
    @Override
    public String getDescription() {
        return "Cake";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
