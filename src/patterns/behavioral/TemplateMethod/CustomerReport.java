package patterns.behavioral.TemplateMethod;

public class CustomerReport extends Report {
    @Override
    protected void collectData() {
        System.out.println("Collecting customer data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting customer data...");
    }

    @Override
    protected void generateOutput() {
        System.out.println("Generating customer report output...");
    }
}