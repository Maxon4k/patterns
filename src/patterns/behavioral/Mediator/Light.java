package patterns.behavioral.Mediator;

public class Light extends SmartDevice {
    public Light(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Light " + name + " received message: " + message);
    }
}
