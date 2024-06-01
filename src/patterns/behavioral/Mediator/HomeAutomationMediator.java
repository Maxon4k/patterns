package patterns.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationMediator implements Mediator {
    private List<SmartDevice> devices;

    public HomeAutomationMediator() {
        this.devices = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, SmartDevice device) {
        for (SmartDevice d : devices) {
            if (d != device) {
                d.receiveMessage(message);
            }
        }
    }

    @Override
    public void addDevice(SmartDevice device) {
        devices.add(device);
    }
}
