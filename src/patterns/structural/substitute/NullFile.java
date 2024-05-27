package patterns.structural.substitute;

// NullFile.java
public class NullFile implements File {
    @Override
    public void read() {
        // Do nothing or provide default behavior
        System.out.println("No file found.");
    }

    @Override
    public void write(String data) {
        // Do nothing or provide default behavior
        System.out.println("Cannot write to null file.");
    }
}
