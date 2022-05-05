package com.basics;

import java.util.Scanner;

public class StudentArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List of Students
//		Student std1 = new Student(101, "Max", "Computer Science", 75);
//		Student std2 = new Student(102, "Mahesh", "Science", 59);
//		Student std3 = new Student(103, "Sai", "Maths", 93);
//		Student std4 = new Student(104, "Andy", "Computer Science", 45);
//		
//		Student[] students = {std1,std2,std3,std4};  //Array of type Student
		
		Student[] students = {
				new Student(101, "Max", "Computer Science", 75),
				new Student(102, "Mahesh", "Science", 59),
				new Student(103, "Sai", "Maths", 93),
				new Student(104, "Andy", "Computer Science", 45)
		};
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course : ");
		String courseSearch = sc.nextLine();
		
		//will loop over students(Student)
		for(Student st: students) {
//			System.out.println(st.course.compareToIgnoreCase(courseSearch));
			if(st.course.compareToIgnoreCase(courseSearch) == 0) {
//				st.display();
				System.out.println(st);
				System.out.println("=============================");
			}
			
		}
		
		
	}

}

class Student{
	
	int stdid;
	String stname;
	String course;
	double marks;
	
	public Student(int stdid, String stname, String course, double marks) {
		this.stdid = stdid;
		this.stname = stname;
		this.course = course;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Student Id : "+this.stdid);
		System.out.println("Student Name : "+this.stname);
		System.out.println("Student Course : "+this.course);
		System.out.println("Student marks : "+this.marks);
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stname=" + stname + ", course=" + course + ", marks=" + marks + "]";
	}
	
	
	
}
