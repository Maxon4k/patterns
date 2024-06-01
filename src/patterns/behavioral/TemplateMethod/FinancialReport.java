package patterns.behavioral.TemplateMethod;

public class FinancialReport extends Report {
    @Override
    protected void collectData() {
        System.out.println("Collecting financial data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting financial data...");
    }

    @Override
    protected void generateOutput() {
        System.out.println("Generating financial report output...");
    }
}
