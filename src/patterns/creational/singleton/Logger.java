package patterns.creational.singleton;

public class Logger {
    // Private static variable of the single instance
    private static Logger instance;

    // Private constructor to restrict instantiation from other classes
    private Logger() {
        // Initialization code here, e.g., opening file streams
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        // Code to write the log message to a file or console
        System.out.println("Log message: " + message);
    }
}
