import java.util.Scanner;
public class EmployeeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Employee e = null;
				
				do {
					System.out.println("Employee Management System");
					System.out.println("1.Register New Employee");
					System.out.println("2.Display Details");
					System.out.println("3.Exit");
					
					
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					
					switch(choice) {
					case 1: 
						e = new Employee(1, "Veer", 500000);
						break;
					case 2:
						if (e!=null)
							e.showDetails();
						break;
					case 3:
			    		System.out.println("Thankyou and visit again");
			    	}
			    	}while (choice !=3);
			    	
			        System.out.println("Number of Employees registered: " + Employee.getCount());
			        
			        sc.close();

				
			
			
//		Employee e = new Employee();
//		e.showDetails();
//		
//		Employee e1 = new Employee(2,"veer", 500000);
//		e1.showDetails();
	}

}
