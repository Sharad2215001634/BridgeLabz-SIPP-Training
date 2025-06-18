package Day2_ControlFlow.Level_3;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in Physics : ");
        double phy = sc.nextDouble();
        System.out.print("Enter Marks in Chemistry : ");
        double chem = sc.nextDouble();
        System.out.print("Enter Marks in Math : ");
        double math = sc.nextDouble();
        double totalMarks = phy + chem+ math;
        double percentage = totalMarks / 3.0;

        System.out.println("Average Marks: " + percentage + "%");

        if(percentage >= 80){
            System.out.println("Level 4, above agency-normalized standards)");
        }
        else if (percentage >= 70 && percentage <=79){
            System.out.println("Level 3, at agency-normalized standards");
        }
        else if(percentage >= 60 && percentage <=69){
            System.out.println("Level 2, below, but approaching agency-normalized standards)");
        }
        else if(percentage >=50 && percentage <=59){
            System.out.println("(Level 1, well below agency-normalized standards)");
        }
        else if(percentage >= 40 && percentage <= 49){
            System.out.println("(Level 1-, too below agency-normalized standards)");
        }
        else if(percentage <= 39 ){
            System.out.println("Remedial standards)");
        }

        else{
            System.out.println("Enter Valid");
        }
        sc.close();
    }
    
}
