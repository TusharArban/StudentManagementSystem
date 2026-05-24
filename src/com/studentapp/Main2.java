package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	static List<Student> studentList;

	public static void main(String[] args) {

		System.out.println("************ Student Management System *************");
		System.out.println("************ Welcome *************");

		studentList = new ArrayList<Student>();

		Student s1 = new Student("kajal shharma", 31, "S-13");
		s1.enrollCourse("Java");
		s1.enrollCourse("DSA");
		s1.enrollCourse("DevOps");

		Student s2 = new Student("Mahir", 27, "S-15");
		s2.enrollCourse("DevOps");

		Student s3 = new Student("Antony", 20, "S-05");
		s3.enrollCourse("DevOps");
		s3.enrollCourse("DSA");

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		findStudentById("S-13");
		sortByName();

	}

	private static void sortByName() {
		Comparator<Student> studentNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		};

		Collections.sort(studentList, studentNameComparator);
		System.out.println(studentList);

	}

	public static Student findStudentById(String studentId) {

		Student result = null;

		try {
			result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst()
					.orElseThrow(() -> new RuntimeException("No Data Found !!!"));
		} catch (RuntimeException e) {
			System.err.println("Student with ID " + studentId + " not found!!");
		}
		return result;
	}

}
