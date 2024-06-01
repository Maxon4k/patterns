package patterns.behavioral.Mediator;

public class Thermostat extends SmartDevice {
    public Thermostat(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Thermostat " + name + " received message: " + message);
    }
}
