package patterns.creational.abstractFactory;

public class TruckFactory implements VehicleFactory {
    @Override
     public Engine createEngine() {
        return new TruckEngine();
    }

    @Override
    public Tire createTire() {
        return new TruckTire();
    }
}