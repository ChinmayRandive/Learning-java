
public class WageEmployee extends Employee {
	private int hours;
	private int rate;
	
	
	public WageEmployee(String name, float basicSalary, int hours, int rate) {
		super(name, basicSalary);
		this.hours = hours;
		this.rate = rate;
	}
	
	
	public double calculateSalary(float basicSalary, int hours, int rate ){
		return  basicSalary+(hours * rate);  
	}
	
	
	@Override 	
				
	//***this is method overriding***
	public void showDetails() {
	     System.out.println("Wage Employee Details:");
	        super.showDetails();
	        System.out.println("Hours Worked: " + hours);
	        System.out.println("Rate per Hour: " + rate);
	        System.out.println("Total Salary: " + this.calculateSalary());
	}
	

		
		
	
}
