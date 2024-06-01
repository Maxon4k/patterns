package patterns.behavioral.TemplateMethod;

public class SalesReport extends Report {
    @Override
    protected void collectData() {
        System.out.println("Collecting sales data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting sales data...");
    }

    @Override
    protected void generateOutput() {
        System.out.println("Generating sales report output...");
    }
}
