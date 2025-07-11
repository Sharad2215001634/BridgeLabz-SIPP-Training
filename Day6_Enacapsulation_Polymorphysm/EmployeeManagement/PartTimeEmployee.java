package Day6_Enacapsulation_Polymorphysm.EmployeeManagement;

class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }
}
