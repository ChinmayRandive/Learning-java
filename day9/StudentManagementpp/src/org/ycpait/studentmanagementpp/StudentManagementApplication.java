package org.ycpait.studentmanagementpp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.ycpait.studentmanagementapp.dao.impl.StudentDaoImpl;
import org.ycpait.studentmanagementpp.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundExceptiont;

public class StudentManagementApplication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		//1. create a reference of Student type
		Student s=null;
	//	int indexCount=0;
	//	Student[] students = new Student[2];
	//List<Student> students = new ArrayList<Student>();
		
		StudentDaoImpl dao = new StudentDaoImpl();
		
//		System.out.println(students[0]);
//		System.out.println(students[1]);

		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Student");
			System.out.println("2. Display Details");
			System.out.println("3.Enter Roll Number");
			System.out.println("4.Delete student by Roll Number");
			System.out.println("5.Sort Student by marks");
			System.out.println("6.Sort Student by names");
			System.out.println("7.Marks Scored More Than 90");
			System.out.println("8.Names of Student Scored More Than 90");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
//				if(indexCount <= students.length)
//				{
//					students[indexCount] = new Student(1,"Amaan", 78.78f);
//					indexCount++;
//				}
//				else
//				{
//					System.err.println("Limit exceeded");
//				}
//				break;
//===================================================================================================
				System.out.println("Enter Your Name:");
				String name = sc.next();
				System.out.println("Enter Your Marks:");
				float marks = sc.nextFloat();
				List<String>subjects = new ArrayList<String>();
				subjects.add("Java");
				subjects.add(".net");
				Student s1 =new Student(name, marks, subjects);
				//students.add(s1);
				dao.save(s1);
				break;
			}
			case 2: {
					//s.display();
					for(Student stu : dao.findAll())
					{
						if(dao.findAll()!=null)
							System.out.println(stu);
					}
				break;
			}
			case 3: {
				
				// seraching array  for syudent
				System.out.println("Enter Roll Number");
				int r = sc.nextInt();
				try {
				Student searchedStudent = dao.findOne(r);
				System.out.println(searchedStudent);
				}
				catch (StudentNotFoundExceptiont ex) {
					ex.printStackTrace();
				}
			}
			break;
			
			
			case 4:
				System.out.println("Enter the roll number");
				int rollNumberToDelete = sc.nextInt();
				dao.deleteone(rollNumberToDelete);
				break;
				
			case 5:
			System.out.println("Sorted marks are");
			Collections.sort(dao.findAll());
			for(Student stu : dao.findAll()) {
				if(stu != null)
					System.out.println(stu);
			}
			break;
			
			case 6:
				System.out.println("Sorted by name");
				Collections.sort(dao.findAll(),(s1,s2)-> s1.getName().compareTo(s2.getName()));
				
				for(Student stu : dao.findAll()) {
					if(stu != null)
						System.out.println(stu);
				}
				break;
				
			case 7:
				System.out.println("Marks Scored More Than 90: ");
				Stream<Student>streamMarks = dao.findAll().stream();
				Stream<Student>filteredLength = streamMarks.filter(c->c.getMarks()>=90);
				List<Student> li = filteredLength.toList();
				System.out.println("Marks Scored More Than 90: "+ li);
				
						//or
				
//				students.stream()
//						.filter(stu-> stu.getMarks()>90)
//						.toList()
//						.forEach(stu-> System.out.println(stu));
//				
				break;
				
			case 8:
				System.out.println("Names Of Student Scored Marks More Than 90");
				List<String>topScoringStudentName=dao.findAll().stream()
															.filter(stu-> stu.getMarks()>90)
															.map(st->st.getName())
															.toList();
				topScoringStudentName.forEach(n-> System.out.println(n));
				break;
				
	
			case -1: {
				
				break;
			}
			default:
				System.out.println("Select correct choice");
				break;
			}
		}while(choice!=-1);
		System.out.println("Program Exit Successful");

	}

}