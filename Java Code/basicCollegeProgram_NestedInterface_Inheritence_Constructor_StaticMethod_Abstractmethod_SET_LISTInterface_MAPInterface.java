import java.util.*

abstract class College{
	String name;

	College(String name){
		this.name = name;
	}

	public abstract void display();
}

class Student extends College{
	private int StudentID;
	private static int counter = 1;

	public Student(String Name){
		super(name);
		this.StudentID = counter++;
	}

	@override
	public void display(){
		Syetem.out.println("Student ID: " + SyudentID + ", Name: " + name);

	}
}

