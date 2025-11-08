package org.ycpait.employeemanagement.entity;

public class Employee {
	
	private int id;
	private  static int count =0;
	private String name;
	private float basicSalary;
	
	
	public Employee() {
		count++;
		this.id= count;
		this.name="dadya";
		this.basicSalary=50000;
		
	}
	
	public Employee(String name, float basicSalary) {
		
		this.id = count;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public static int getCount() {
		return count;
	}

	
	public void showDetails() {
		System.out.println("Employee id:"+ id);
		System.out.println("Employee name:"+ name);
		System.out.println("Employee Salary:"+ basicSalary);
	}
	
	public double calculateSalary() {
		return  basicSalary;
	}
	
}
