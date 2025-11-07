public class Employee {
    protected static int count = 0;
    protected int id;
    protected String name;
    protected double basicSalary;

    // Default constructor
    public Employee() {
        count++;
        this.id = count;
        this.name = "mama";
        this.basicSalary =400000.0;
    }

    // Parameterized constructor
    public Employee(String name, double basicSalary) {
        count++;
        this.id = count;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    
    public static int getCount () {
		return count; 
}

    // Method to print employee details
    public void showDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
    }
    
    
//    public void showDetails() {
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(basicSalary);
//    }

    // Method to calculate salary
    public double calculateSalary() {
        return basicSalary;
    }
    
    @Override 
	//to string print the information of object
	public String toString() {
		 System.out.println("in toString");
		return this.id + " " + this.name + " " + this.basicSalary;
	}

}
