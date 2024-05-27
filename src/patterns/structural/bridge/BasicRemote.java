package patterns.structural.bridge;

public class BasicRemote implements RemoteControl {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        System.out.println("Remote: Powering on the device.");
        device.turnOn();
    }

    @Override
    public void powerOff() {
        System.out.println("Remote: Powering off the device.");
        device.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Remote: Setting the channel to " + channel);
        device.setChannel(channel);
    }
}