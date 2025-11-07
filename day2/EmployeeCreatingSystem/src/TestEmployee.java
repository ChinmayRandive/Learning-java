import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
    	int choice=-1;  // local variable
    	Employee e= null;   // local variable
    	Manager m = null;
    	WageEmployee wE = null;
    	Scanner sc = new Scanner(System.in); 
    	
    	do {
    	System.out.println("Welcome To Employee management System");
    	System.out.println("=====================================");
    	System.out.println("1.Register New Employee");
    	System.out.println("2.Display Details");
    	System.out.println("-1.Exit");
    	System.out.println("Enter your choice");
    	choice = sc.nextInt();
    	
    	switch(choice) {
    	case 1:
    		e = new Employee("rahul",785598);
    		wE = new WageEmployee("Raam",25000.00f, 10, 200);
    		m = new Manager("Shaam", 32000.00f, 15000);
    		break;
    	case 2:
    		if(e!= null)
    			e.showDetails();
    			System.out.println("================================================1");
    			wE.showDetails();
    			System.out.println("================================================1");
    			m.showDetails();
    			//System.out.println(e);
    		break;
    	case -1:
    		System.out.println("Thankyou and visit again");
    	}
    	}while (choice !=-1);
    	
        System.out.println("Number of Employees registered: " + Employee.getCount());

       
//        Employee e = new Employee();
//        e.showDetails(); 
//
//     
//        Employee e2 = new Employee("Chinmay", 5000000);
//
//        System.out.println("\nNumber of Employees registered: " + Employee.getCount());
//        e2.showDetails(); 
    }
}
