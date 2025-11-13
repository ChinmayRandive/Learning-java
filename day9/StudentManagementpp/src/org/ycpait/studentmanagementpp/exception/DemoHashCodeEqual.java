package org.ycpait.studentmanagementpp.exception;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.ycpait.studentmanagementpp.entity.Student;

public class DemoHashCodeEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> students = new HashSet<Student>();
//		
//		Student s1= new Student ("Amit",88);
//		Student s2= new Student ("Amit",67);
//		
//		students.add(s1);
//		students .add(s2);
		
		System.out.println(students.size());
	}

}
