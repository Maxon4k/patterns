package patterns.behavioral.ChainOFresponsibilities;

// SupportRequest.java
public class SupportRequest {
    private String message;
    private int level;

    public SupportRequest(String message, int level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public int getLevel() {
        return level;
    }
}