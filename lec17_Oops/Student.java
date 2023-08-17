package lec17_Oops;

public class Student {

	private String name;
	private final int Roll_no;
	private double cgpa;
	private static int studentId;

	public Student(String name) {
		this.name = name;
		studentId++;
		this.Roll_no = studentId;

	}
	
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	//get
	
	public static int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getRoll_no() {
		return Roll_no;
	}
}
