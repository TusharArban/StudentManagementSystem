package com.studentapp;

public class Main {

	public static void main(String[] args) {

		System.out.println("************ Student Management System *************");
		System.out.println("************ Welcome *************");

		Student s1 = new Student("kajal shharma", 31, "S-1");
		s1.enrollCourse("Java");
		s1.enrollCourse("DSA");
		s1.enrollCourse("DevOps");

		s1.printStudentInfo();
//		System.out.println(s1);

		Student s2 = new Student("Mahir", 27, "S-15");
		s2.enrollCourse("DevOps");
		s2.printStudentInfo();
//		System.out.println(s2);

		Student s3 = new Student("Antony", 20, "S-05");
		s3.enrollCourse("DevOps");
		s3.enrollCourse("DSA");
		s3.printStudentInfo();
//		System.out.println(s3);

	}

}
