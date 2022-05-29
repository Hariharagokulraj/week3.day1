package week3.day1;

public class Student {
	public void getStudentInfo() {
		System.out.println("Student Detail");
	}
	public void getStudentInfo(int studentId) {
		System.out.println("Studentid =" + studentId);
	}
	public void getStudentInfo(int studentId, String studentName) {
		System.out.println("Student id=" + studentId);
		System.out.println("Student name=" + studentName);
	}
	public void getStudentInfo(String studentEmail, long studentPhone) {
		System.out.println("Sudent Phone number=" + studentPhone);
		System.out.println("Student email" + studentEmail);
	}
	public static void main(String[] args) {
		Student stu= new Student();
		stu.getStudentInfo();
		stu.getStudentInfo(501);
		stu.getStudentInfo(502, "Raj");
		stu.getStudentInfo("raj@gmail.com",9889799877L);
	}
}
