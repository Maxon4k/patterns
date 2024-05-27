package patterns.structural.lightweight;

public class TextEditor {
    private TextStyle style;

    public void applyStyle(String styleName, String text) {
        style = TextStyleFactory.getStyle(styleName);
        style.apply(text);
    }
}
