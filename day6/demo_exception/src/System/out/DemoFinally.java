package System.out;

public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				System.out.println("In Try:");
				System.out.println("1/0");
			}
//				catch(Exception e) {
//					System.out.println("In Catch");
//				}
				finally {
					System.out.println("In Finally");
				}
			
	}

}
