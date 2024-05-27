package patterns.creational.factory;

// ArcherFactory.java
public class ArcherFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Archer();
    }
}
