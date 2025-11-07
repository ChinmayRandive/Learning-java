**Employee.java**



public class Employee {

&nbsp;   protected static int count = 0;

&nbsp;   protected int id;

&nbsp;   protected String name;

&nbsp;   protected double basicSalary;



&nbsp;   // Default constructor

&nbsp;   public Employee() {

&nbsp;       count++;

&nbsp;       this.id = count;

&nbsp;       this.name = "mama";

&nbsp;       this.basicSalary =400000.0;

&nbsp;   }



&nbsp;   // Parameterized constructor

&nbsp;   public Employee(String name, double basicSalary) {

&nbsp;       count++;

&nbsp;       this.id = count;

&nbsp;       this.name = name;

&nbsp;       this.basicSalary = basicSalary;

&nbsp;   }

&nbsp;   

&nbsp;   public static int getCount () {

&nbsp;		return count; 

}



&nbsp;   // Method to print employee details

&nbsp;   public void showDetails() {

&nbsp;       System.out.println("Employee ID: " + this.id);

&nbsp;       System.out.println("Employee Name: " + this.name);

&nbsp;       System.out.println("Basic Salary: " + this.basicSalary);

&nbsp;   }

&nbsp;   

&nbsp;   

//    public void showDetails() {

//        System.out.println(id);

//        System.out.println(name);

//        System.out.println(basicSalary);

//    }



&nbsp;   // Method to calculate salary

&nbsp;   public double calculateSalary() {

&nbsp;       return basicSalary;

&nbsp;   }

&nbsp;   

&nbsp;   @Override 

&nbsp;	//to string print the information of object

&nbsp;	public String toString() {

&nbsp;		 System.out.println("in toString");

&nbsp;		return this.id + " " + this.name + " " + this.basicSalary;

&nbsp;	}



}









----------------------------------------------------------------------------------------------------------------------



**manager.java**







public class Manager extends Employee{

&nbsp;	

&nbsp;	private int incentives;



&nbsp;	public Manager(String name, double basicSalary,int incentives) {

&nbsp;		super(name, basicSalary);

&nbsp;		this.incentives = incentives;

&nbsp;	}

&nbsp;	

&nbsp;	 public double calculateSalary(float basicSalary ) {

&nbsp;	        return basicSalary + incentives;

&nbsp;	    }

&nbsp;	

&nbsp;	    public void showDetails() {

&nbsp;	        System.out.println("Manager Details:");

&nbsp;	        super.showDetails();

&nbsp;	        System.out.println("Incentives: " + this.incentives);

&nbsp;	        System.out.println("Total Salary: " + this.calculateSalary());

}



}



--------------------------------------------------------------------------------------------------------------------

**TestEmployee.java**







import java.util.Scanner;



public class TestEmployee {



&nbsp;   public static void main(String\[] args) {

&nbsp;   	int choice=-1;  // local variable

&nbsp;   	Employee e= null;   // local variable

&nbsp;   	Manager m = null;

&nbsp;   	WageEmployee wE = null;

&nbsp;   	Scanner sc = new Scanner(System.in); 

&nbsp;   	

&nbsp;   	do {

&nbsp;   	System.out.println("Welcome To Employee management System");

&nbsp;   	System.out.println("=====================================");

&nbsp;   	System.out.println("1.Register New Employee");

&nbsp;   	System.out.println("2.Display Details");

&nbsp;   	System.out.println("-1.Exit");

&nbsp;   	System.out.println("Enter your choice");

&nbsp;   	choice = sc.nextInt();

&nbsp;   	

&nbsp;   	switch(choice) {

&nbsp;   	case 1:

&nbsp;   		e = new Employee("rahul",785598);

&nbsp;   		wE = new WageEmployee("Raam",25000.00f, 10, 200);

&nbsp;   		m = new Manager("Shaam", 32000.00f, 15000);

&nbsp;   		break;

&nbsp;   	case 2:

&nbsp;   		if(e!= null)

&nbsp;   			e.showDetails();

&nbsp;   			System.out.println("================================================1");

&nbsp;   			wE.showDetails();

&nbsp;   			System.out.println("================================================1");

&nbsp;   			m.showDetails();

&nbsp;   			//System.out.println(e);

&nbsp;   		break;

&nbsp;   	case -1:

&nbsp;   		System.out.println("Thankyou and visit again");

&nbsp;   	}

&nbsp;   	}while (choice !=-1);

&nbsp;   	

&nbsp;       System.out.println("Number of Employees registered: " + Employee.getCount());



&nbsp;      

//        Employee e = new Employee();

//        e.showDetails(); 

//

//     

//        Employee e2 = new Employee("Chinmay", 5000000);

//

//        System.out.println("\\nNumber of Employees registered: " + Employee.getCount());

//        e2.showDetails(); 

&nbsp;   }

}



--------------------------------------------------------------------------------------------

WageEmployee.java





public class WageEmployee extends Employee {

&nbsp;	private int hours;

&nbsp;	private int rate;

&nbsp;	

&nbsp;	

&nbsp;	public WageEmployee(String name, float basicSalary, int hours, int rate) {

&nbsp;		super(name, basicSalary);

&nbsp;		this.hours = hours;

&nbsp;		this.rate = rate;

&nbsp;	}

&nbsp;	

&nbsp;	

&nbsp;	public double calculateSalary(float basicSalary, int hours, int rate ){

&nbsp;		return  basicSalary+(hours \* rate);  

&nbsp;	}

&nbsp;	

&nbsp;	

&nbsp;	@Override 	

&nbsp;				

&nbsp;	//\*\*\*this is method overriding\*\*\*

&nbsp;	public void showDetails() {

&nbsp;	     System.out.println("Wage Employee Details:");

&nbsp;	        super.showDetails();

&nbsp;	        System.out.println("Hours Worked: " + hours);

&nbsp;	        System.out.println("Rate per Hour: " + rate);

&nbsp;	        System.out.println("Total Salary: " + this.calculateSalary());

&nbsp;	}

&nbsp;	



&nbsp;		

&nbsp;		

&nbsp;	

}



