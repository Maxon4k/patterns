package patterns.creational.abstractFactory;

public class BikeTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bike Tire");
    }
}