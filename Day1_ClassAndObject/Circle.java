package Day1_ClassAndObject;
import java.util.*;
public class Circle {
    public double radius;
    final double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return pi * radius*radius;
    }
    public double circumference(){
        return 2 * pi*radius;
    }
    public void display(){
        System.out.println("Radius of circle is : " + radius);
        System.out.println("Area of circle is : " + area());
        System.out.println("Circumference of circle is : " +circumference());
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of Radius : ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.display();
        sc.close();
    }
    
}

