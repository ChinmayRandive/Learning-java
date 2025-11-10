package org.ycpait.studentmanagementpp;
import java.util.Scanner;

import org.ycpait.studentmanagementpp.entity.Student;
import org.ycpait.studentmanagementpp.exception.StudentNotFoundExceptiont;

public class StudentManagementApplication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		//1. create a reference of Student type
		Student s=null;
		int indexCount=0;
		Student[] students = new Student[2];
		System.out.println(students[0]);
		System.out.println(students[1]);

		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("3.Enter Roll Number");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				if(indexCount <= students.length)
				{
					students[indexCount] = new Student(1,"Amaan", 78.78f);
					indexCount++;
				}
				else
				{
					System.err.println("Limit exceeded");
				}
				break;
			}
			case 2: {
					//s.display();
					for(Student stu : students)
					{
						if(students!=null)
							System.out.println(stu);
					}
				break;
			}
			case 3: {
				boolean isFound = false;
				// seraching array  for syudent
				System.out.println("Enter Roll Number");
				int r = sc.nextInt();
				for(Student foundStudent : students) {
					if(foundStudent !=null && foundStudent.getRollNumber()==r) {
						System.out.println(foundStudent);
						isFound=true;
						break;
					}
				}
				if(!isFound) {
					//Generate Exception
					StudentNotFoundExceptiont e=new StudentNotFoundExceptiont("Student with RollNo "+ r +" Not Found!");
					try {
						throw e;
					}
					catch (StudentNotFoundExceptiont ex) {
						ex.printStackTrace();
					}
			}
				
				
				
			}
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