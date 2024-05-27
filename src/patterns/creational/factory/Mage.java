package patterns.creational.factory;

public class Mage implements Character {
    @Override
    public String attack() {
        return "Mage casts a fireball!";
    }

    @Override
    public String defend() {
        return "Mage creates a magic barrier!";
    }
}
