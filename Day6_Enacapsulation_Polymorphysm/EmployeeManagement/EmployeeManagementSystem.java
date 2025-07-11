package Day6_Enacapsulation_Polymorphysm.EmployeeManagement;
import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 30000, 5000);
        emp1.assignDepartment("HR");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 15000, 40, 200);
        emp2.assignDepartment("IT");

        employees.add(emp1);
        employees.add(emp2);
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
