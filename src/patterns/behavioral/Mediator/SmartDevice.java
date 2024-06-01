package patterns.behavioral.Mediator;

public abstract class SmartDevice {
    protected Mediator mediator;
    protected String name;

    public SmartDevice(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receiveMessage(String message);

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public String getName() {
        return name;
    }
}