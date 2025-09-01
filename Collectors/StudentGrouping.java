import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private final String name;
    private final int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() { return name; }
    public int getGradeLevel() { return gradeLevel; }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 10),
            new Student("Bob", 10),
            new Student("Charlie", 11),
            new Student("David", 12),
            new Student("Eve", 11),
            new Student("Frank", 12),
            new Student("Grace", 10)
        );

        
        Map<Integer, List<String>> groupedByGrade =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.mapping(Student::getName, Collectors.toList()) 
                    ));

        
        groupedByGrade.forEach((grade, names) -> 
            System.out.println("Grade " + grade + " → " + names)
        );
    }
}
