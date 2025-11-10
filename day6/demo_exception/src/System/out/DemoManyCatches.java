package System.out;

public class DemoManyCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String s= null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
		}
//		catch(ArithmeticException e){
//			System.out.println("CanNot Divide By Zero");
//		}
//		catch(NullPointerException e) {
//			System.out.println("can not invoke method or null reference");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index Out of Range");
//		}
		catch(Exception e) {				// it is used to handle all type of exception. 
			System.out.println("Generic");
		}
		System.out.println("After"); // After is printing means program is handling exception
	}

}
