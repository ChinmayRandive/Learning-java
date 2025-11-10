package demo_exception;
public class DemoExceptionHandling {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 0;
		
		try {
		int result = num1/num2;
		System.out.println("Result: "+result);
		}
		
		//System.out.println("In between"); // Error
		catch (ArithmeticException e) {
			System.out.println("CanNot Divide By Zero");
			e.printStackTrace();  //this print complete
									// stack tree on console
									//needed for debugging
		}
	}

}
