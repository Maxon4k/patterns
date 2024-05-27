package patterns.creational.prototype;

public interface Robot extends Cloneable {
    Robot clone();
    void showDetails();
}
