package org.ycpait.employeemanagement.entity;
public class Manager extends Employee{
	
private int incentives;

public Manager(String name,int basicSalary,int incentives) {
	super(name, basicSalary);
	this.incentives = incentives;
}
	
	
	public double calculateSalary(float basicSalary) {
		
		return basicSalary + incentives; 

}
	@Override
	public void showDetails() {
		System.out.print("Manager Details are: ");
		super.showDetails();
		System.out.println("Manager Comission is:"+ this.incentives);
		System.out.println("Manager salary :"+ this.calculateSalary());
	}

 
}
