
public class DemoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =97;
		int i=2;
		boolean isprime = true;
		
		while(i<number){
			if(number % i ==0)
			{
				isprime = false;
				break;
			}
			i++;
			
	}
	if(isprime){
		System.out.println(" prime");
	}
	else{
	    System.out.println(" not prime");
	}
	}

}
