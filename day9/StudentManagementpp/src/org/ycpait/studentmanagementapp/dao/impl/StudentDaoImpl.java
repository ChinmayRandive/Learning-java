package org.ycpait.studentmanagementapp.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.ycpait.studentmanagementpp.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundExceptiont;

public class StudentDaoImpl {

	private List<Student> students;

	public StudentDaoImpl() {
		this.students = new ArrayList<Student>();
	}

	public void save(Student s) {

		this.students.add(s);
	}

	// usage: it is Highly colesive class
	public List<Student> findAll() {
		return students;
	}

	// case3
	public Student findOne(int rollNumber) throws StudentNotFoundExceptiont {
		// boolean isFound = false;
		for (Student foundStudent : students) {
			if (foundStudent != null && foundStudent.getRollNumber() == rollNumber) {
				System.out.println(foundStudent);
				// isFound=true;
				return foundStudent;
			}
		}
		// Generate Exception
		StudentNotFoundExceptiont e = new StudentNotFoundExceptiont(
				"Student with RollNo " + rollNumber + " Not Found!");
	
		return this.students.stream()
				.filter(s->s.getRollNumber()== rollNumber)
				.findFirst() //  terminal operation
				.orElseThrow(()-> e);
		
		//throw e;
	}
	public void deleteone(int rollNumber) {
		// case4

		Iterator<Student> i = students.iterator();

		while (i.hasNext()) {
			Student studentTobeDeleted = i.next();
			if (studentTobeDeleted.getRollNumber() == rollNumber)
				i.remove();
		}

//		public void sortNumber() {
//			
//			
//		}
	}

}
