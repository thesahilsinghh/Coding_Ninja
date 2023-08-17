package lec17_Oops;

public class studentId {

	public static void main(String[] args) {

		Student s1 = new Student("Ram");
		System.out.println(Student.getStudentId());
		System.out.println(s1.getRoll_no());
		s1.setCgpa(6.9);
		System.out.println(s1.getCgpa());
		System.out.println(s1.getName());

	}

}