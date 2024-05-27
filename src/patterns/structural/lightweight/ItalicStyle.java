package patterns.structural.lightweight;

public class ItalicStyle implements TextStyle {
    @Override
    public void apply(String text) {
        System.out.println("Applying italic style to: " + text);
    }
}