package Day1_LinkedList;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Student head = null;
    public void addAtBeginning(Student student) {
        student.next = head;
        head = student;
    }
    public void addAtEnd(Student student) {
        if (head == null) {
            head = student;
        } else {
            Student temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = student;
        }
    }
    public void addAtPosition(Student student, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(student);
            return;
        }
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        student.next = temp.next;
        temp.next = student;
    }
    public void deleteByRoll(int rollNo) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Record deleted.");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Roll Number not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record deleted.");
        }
    }

    public void searchByRoll(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.rollNo + ", " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    
    public void updateGrade(int rollNo, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    
    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }

        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        while (true) {
            System.out.println("\n--- Student Record Menu ---");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Update Grade by Roll Number");
            System.out.println("7. Display All Students");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            int roll, age, pos;
            String name, grade;

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next();
                    list.addAtBeginning(new Student(roll, name, age, grade));
                    break;

                case 2:
                    System.out.print("Enter Roll, Name, Age, Grade: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next();
                    list.addAtEnd(new Student(roll, name, age, grade));
                    break;

                case 3:
                    System.out.print("Enter Roll, Name, Age, Grade and Position: ");
                    roll = sc.nextInt();
                    name = sc.next();
                    age = sc.nextInt();
                    grade = sc.next();
                    pos = sc.nextInt();
                    list.addAtPosition(new Student(roll, name, age, grade), pos);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    roll = sc.nextInt();
                    list.deleteByRoll(roll);
                    break;

                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    roll = sc.nextInt();
                    list.searchByRoll(roll);
                    break;

                case 6:
                    System.out.print("Enter Roll Number and new Grade: ");
                    roll = sc.nextInt();
                    grade = sc.next();
                    list.updateGrade(roll, grade);
                    break;

                case 7:
                    list.displayAll();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            sc.close();
        }
    }
}
