package ex09_08;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234569", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentno : " + student.studentNo);

	}
}
