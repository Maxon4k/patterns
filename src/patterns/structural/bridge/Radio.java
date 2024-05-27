package patterns.structural.bridge;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Radio frequency is set to " + channel);
    }
}