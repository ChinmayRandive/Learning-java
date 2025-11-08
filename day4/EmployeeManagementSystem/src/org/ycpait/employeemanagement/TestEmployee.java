package org.ycpait.employeemanagement;
import java.util.Scanner;

import org.ycpait.employeemanagement.entity.Employee;
import org.ycpait.employeemanagement.entity.Manager;
import org.ycpait.employeemanagement.entity.WageEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = -1;
		Employee e = null;
		Manager m= null;
		WageEmployee wE =null;
		
		Scanner sc =  new Scanner (System.in);
		
		do {
		System.out.println("Welcome To Employee Management Ststem");
		System.out.println("1.Register new Employee");
		System.out.println("2.Display Details");
		System.out.println("-1.Exit ");
		System.out.println("Thankyou");
		System.out.println("Enter Your choice");
		
		choice=sc.nextInt();
		
		
		switch(choice) {
		case 1:
			e =new Employee("kaka",456123);
			m = new Manager("pandu",789456,5000);
			wE = new WageEmployee("Zandu",5000.0f,8,300);
			break;
		
		
		case 2: 
			
		if (e!=null)
			e.showDetails();
			m.showDetails();
			wE.showDetails();
		
		
		case -1:
			System.out.println("Thankyou visit again ");
		}
		}while(choice!=-1);

	System.out.println("Number of Employee Register are: "+ Employee.getCount());
}

	
	}
