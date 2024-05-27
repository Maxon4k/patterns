package patterns.creational.factory;

public class Warrior implements Character {
    @Override
    public String attack() {
        return "Warrior attacks with a sword!";
    }

    @Override
    public String defend() {
        return "Warrior defends with a shield!";
    }
}