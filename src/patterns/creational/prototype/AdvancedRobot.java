package patterns.creational.prototype;

public class AdvancedRobot implements Robot {
    private String model;
    private String color;
    private String weapon;

    public AdvancedRobot(String model, String color, String weapon) {
        this.model = model;
        this.color = color;
        this.weapon = weapon;
    }

    @Override
    public Robot clone() {
        return new AdvancedRobot(this.model, this.color, this.weapon);
    }

    @Override
    public void showDetails() {
        System.out.println("AdvancedRobot [Model: " + model + ", Color: " + color + ", Weapon: " + weapon + "]");
    }
}
