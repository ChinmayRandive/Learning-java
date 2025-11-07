
public class SkippingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =1007;
		int reverse = 0;
		
		while (number>0) {
			int digit = number % 10; 
				number = number /10;
			
		if  (digit==0) {
			continue;
	}
				reverse = reverse *10 + digit;
	}
		int temp=0;
		while(reverse>0) {
			int digit= reverse % 10;
				reverse =reverse/10;
		
				temp= temp *10 + digit;
	}
				System.out.println(temp);
}
}

