package patterns.creational.abstractFactory;

// CarFactory.java
public class CarFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Tire createTire() {
        return new CarTire();
    }
}

