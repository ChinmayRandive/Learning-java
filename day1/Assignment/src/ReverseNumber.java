
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//int digit;
			int number= 678;
			int reverse= 0;
		
			while(number!=0) {
				int digit= number % 10;
				reverse= reverse *10 + digit;
				//number= number/10;
				number =number/10;
			}
				System.out.println(reverse);
			
			
			
	}

}
