package patterns.creational.abstractFactory;

public class VehicleApplication {
    private Engine engine;
    private Tire tire;

    public VehicleApplication(VehicleFactory factory) {
        engine = factory.createEngine();
        tire = factory.createTire();
    }

    public void manufacture() {
        engine.design();
        tire.manufacture();
    }
}