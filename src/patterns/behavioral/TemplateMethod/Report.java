package patterns.behavioral.TemplateMethod;

public abstract class Report {
    // Template method
    public final void generateReport() {
        collectData();
        formatData();
        generateOutput();
    }

    protected abstract void collectData();

    protected abstract void formatData();

    protected abstract void generateOutput();
}