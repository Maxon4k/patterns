package patterns.behavioral.Mediator;

public class SecurityCamera extends SmartDevice {
    public SecurityCamera(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("SecurityCamera " + name + " received message: " + message);
    }
}