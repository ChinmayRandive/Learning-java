package org.ycpait.employeemanagement.entity;
public class WageEmployee extends Employee {
	
	private int hours;
	private int rate;
	
	
	public WageEmployee(String name, float basicSalary, int hours, int rate) {
		super(name,basicSalary);
		this.hours = hours;
		this.rate = rate;
	}
	
	public double calculateSalary(float basicSalary,int hours,int rate) {
		
		return basicSalary+(hours*rate);
	}
	
	@Override
	public void showDetails() {
		System.out.print("Employee Details are: ");
		super.showDetails();
		System.out.println("Employee Working Hours:"+ hours);
		System.out.println("Employee hours rate:"+ rate);
		System.out.println("Employee Basic Salary:"+ this.calculateSalary());
	}
	

}
