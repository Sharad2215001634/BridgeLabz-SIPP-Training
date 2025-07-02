package Day2_Static_Final;

public class Employee {
    static String companyName = "TechNova Solutions";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sharad", 1001, "Software Engineer");
        Employee emp2 = new Employee("Singh", 1002, "Data Analyst");
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();
        Employee.displayTotalEmployees();
    }
}
