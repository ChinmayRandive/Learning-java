
public class Employee {

	private static int count =0;
    private int id;
	private String name;
	private double basicSalary;
	

		Employee(){
			count++;
			this.id = count;
			this.name = "Demo";
			this.basicSalary = 50000.0;
		}
			Employee(String name, double basicSalary){
				this.id = count;
				this.name = name;
				this.basicSalary = basicSalary; 
			
			}
			public static int getCount() {
				return  count;
			}
			
			
			
			public void showDetails() {
				System.out.println("Employee id:"+id);
				System.out.println("Employee name:"+ name);
				System.out.println("Employee basicSalary:"+ basicSalary);
			
			}
			
			
}

	


