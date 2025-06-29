package Day1_ClassAndObject;
import java.util.*;
public class Employee {
    String Name;
        int id;
        int salary;
        public Employee(String Name, int id, int salary){
            this.Name = Name;
            this.id = id;
            this.salary = salary;
        }
        public void display(){
            System.out.println("Your name is : " + Name);
            System.out.println("Your Id is : " + id);
            System.out.println("Your Salary is : " + salary);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Id : ");
        int id = sc.nextInt();
        System.out.print("Enter Salary : ");
        int salary  = sc.nextInt();
        Employee e = new Employee(name,id, salary);
        e.display();
        sc.close();
    }    
}
