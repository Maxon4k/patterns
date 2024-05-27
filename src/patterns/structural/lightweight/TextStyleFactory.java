package patterns.structural.lightweight;

// TextStyleFactory.java
import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private static final Map<String, TextStyle> styleMap = new HashMap<>();

    public static TextStyle getStyle(String styleName) {
        TextStyle style = styleMap.get(styleName);
        if (style == null) {
            switch (styleName.toLowerCase()) {
                case "bold":
                    style = new BoldStyle();
                    break;
                case "italic":
                    style = new ItalicStyle();
                    break;
                case "underline":
                    style = new UnderlineStyle();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported style: " + styleName);
            }
            styleMap.put(styleName, style);
        }
        return style;
    }
}
