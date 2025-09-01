import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private final String name;
    private final String department;
    private final double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getName() { return name; }
}

public class EmplyoeeSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 60000),
            new Employee("Bob", "IT", 70000),
            new Employee("Charlie", "HR", 50000),
            new Employee("David", "HR", 55000),
            new Employee("Eve", "Finance", 75000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " → Avg Salary: " + avg));
    }
}
