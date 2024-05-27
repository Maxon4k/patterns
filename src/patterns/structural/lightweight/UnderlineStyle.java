package patterns.structural.lightweight;

public class UnderlineStyle implements TextStyle {
    @Override
    public void apply(String text) {
        System.out.println("Applying underline style to: " + text);
    }
}