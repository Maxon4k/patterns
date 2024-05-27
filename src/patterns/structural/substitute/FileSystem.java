package patterns.structural.substitute;

public class FileSystem {
    private File file;

    public FileSystem(File file) {
        this.file = file;
    }

    public void readFile() {
        file.read();
    }

    public void writeFile(String data) {
        file.write(data);
    }
}