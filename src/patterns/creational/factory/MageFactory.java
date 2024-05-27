package patterns.creational.factory;

// MageFactory.java
public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}