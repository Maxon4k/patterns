package patterns.structural.lightweight;

public class BoldStyle implements TextStyle {
    @Override
    public void apply(String text) {
        System.out.println("Applying bold style to: " + text);
    }
}