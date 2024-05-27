package patterns.structural.bridge;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV channel is set to " + channel);
    }
}