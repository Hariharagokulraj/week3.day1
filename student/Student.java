package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Gokkul");
	}
	public void studentDept() {
		System.out.println("Botany");
	}
	public void studentId() {
		System.out.println("1405");
	}
	public static void main(String[] args) {
		Student Stu= new Student();
		Stu.collegeName();
		Stu.collegeCode();
		Stu.collegeRank();
		Stu.deptName();
		Stu.studentName();
		Stu.studentId();
		Stu.studentDept();
	}
}
