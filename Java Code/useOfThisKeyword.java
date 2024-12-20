class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String course) {
        this(name, age);
        this.course = course;
    }

    public void displayDetails() {
        printStudent(this);
    }
    private void printStudent(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Course: " + student.course);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Deb", 20, "Computer Science");
        s1.displayDetails();
    }
}
