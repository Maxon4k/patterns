package patterns.structural.substitute;

public class DefaultFile implements File {
    @Override
    public void read() {
        System.out.println("Reading file content");
    }

    @Override
    public void write(String data) {
        System.out.println("Writing data to file: " + data);
    }
}