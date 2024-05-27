package patterns.creational.abstractFactory;

public interface VehicleFactory {
    Engine createEngine();
    Tire createTire();
}