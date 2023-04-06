import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()) {
            Student student = iter.next();

            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John Doe", 1));
        students.add(new Student("Jane Smith", 2));
        students.add(new Student("Bob Johnson", 3));
        students.add(new Student("Alice Lee", 1));
        students.add(new Student("Mike Wilson", 2));
        students.add(new Student("Sara Jones", 3));
        students.add(new Student("David Brown", 1));
        students.add(new Student("Emily Davis", 2));
        students.add(new Student("Tom White", 3));
        students.add(new Student("Amy Taylor", 1));

        int course = 2;
        System.out.println("Students in course " + course + ":");
        printStudents(students, course);
    }
}