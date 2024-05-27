package patterns.creational.prototype;

public class BasicRobot implements Robot {
    private String model;
    private String color;

    public BasicRobot(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Robot clone() {
        return new BasicRobot(this.model, this.color);
    }

    @Override
    public void showDetails() {
        System.out.println("BasicRobot [Model: " + model + ", Color: " + color + "]");
    }
}
