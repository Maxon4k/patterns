package patterns.creational.abstractFactory;

public class CarTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car Tire");
    }
}

