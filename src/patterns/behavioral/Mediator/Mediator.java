package patterns.behavioral.Mediator;

public interface Mediator {
    void sendMessage(String message, SmartDevice device);

    void addDevice(SmartDevice device);
}