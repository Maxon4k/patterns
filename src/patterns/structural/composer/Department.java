package patterns.structural.composer;

// Department.java
import java.util.ArrayList;
import java.util.List;

public class Department implements EmployeeComponent {
    private String name;
    private List<EmployeeComponent> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(EmployeeComponent employee) {
        employees.add(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (EmployeeComponent employee : employees) {
            employee.showDetails();
        }
    }
}
