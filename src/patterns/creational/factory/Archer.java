package patterns.creational.factory;

// Archer.java
public class Archer implements Character {
    @Override
    public String attack() {
        return "Archer shoots an arrow!";
    }

    @Override
    public String defend() {
        return "Archer dodges the attack!";
    }
}
