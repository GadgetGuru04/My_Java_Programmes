class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("--------------------");
    }
}

public class displayStudentDetails {
    public static void displayStudents(Student[] students) {
        for (Student student : students) {
            student.display();
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Deb", 20, "C Language"),
            new Student("Ram", 22, "Java Language"),
            new Student("Sam", 19, "C++ language")
        };

        displayStudents(students);
    }
}
