package patterns.creational.abstractFactory;

public class TruckTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Truck Tire");
    }
}