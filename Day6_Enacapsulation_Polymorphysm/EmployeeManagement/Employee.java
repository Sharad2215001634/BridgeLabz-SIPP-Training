package Day6_Enacapsulation_Polymorphysm.EmployeeManagement;


abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartmentDetails() {
        return department;
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }


    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name       : " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department : " + department);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}

