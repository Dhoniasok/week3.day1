package org.student;

import org.college.College;
import org.department.Department;

public class Student {

	public void studentName() {
		System.out.println("Dhoni");
		
	}
	public void studentDept() {
		System.out.println("ECE");
		
	}
	public void studentId() {
		System.out.println("123");
		
	}
	
	public static void main(String[] args) {
		// multilevel inheritance
		College str = new College();
		str.collegeCode();
		str.collegeName();
		str.CollegeRank();
		
		Department md =new Department();
		md.deptName();
		
		Student arr = new Student();
		arr.studentName();
		arr.studentId();
		arr.studentDept();
		
		
	}
}
