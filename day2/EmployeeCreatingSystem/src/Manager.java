
public class Manager extends Employee{
	
	private int incentives;

	public Manager(String name, double basicSalary,int incentives) {
		super(name, basicSalary);
		this.incentives = incentives;
	}
	
	 public double calculateSalary(float basicSalary ) {
	        return basicSalary + incentives;
	    }
	
	    public void showDetails() {
	        System.out.println("Manager Details:");
	        super.showDetails();
	        System.out.println("Incentives: " + this.incentives);
	        System.out.println("Total Salary: " + this.calculateSalary());
}

}