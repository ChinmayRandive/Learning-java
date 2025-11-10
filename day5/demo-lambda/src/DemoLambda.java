
public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		 //Printable f = () -> {};
		 Printable f = ()-> {return 8;};
//==============================================================================================		 
		 
		 	//double calculateTax(double income); //bigger to write
//method1     Taxable t = (double income) -> {return income * 0.20;};
		 
		 //shorter to write
//method2     Taxable t = (income) -> {return income * 0.20;};
		 
		 //only one argument so we can remove () to make it short.
		 //only one argument in the body of lambda we can remove {}.
//method 3 and 4 combine.
		 Taxable t = income ->  income * 0.20;

		 System.out.println(t.calculateTax(1000));
//==============================================================================================		 
		 //String join (String s1,String s2);
//Method1		StringJoiner sj = (String s1,String s2) -> {return s1 + s2 ;};
		 
		 
//Method2		StringJoiner sj = (s1, s2) -> {return s1 + s2 ;};
		 
//Method 3 & 4		 
		 StringJoiner sj = (s1, s2) ->  s1 + s2 ;
		 
		 System.out.println(sj.join("A", "B"));
//==============================================================================================		 
	
		 // boolean search(String data);
		 
		 Searchable se = (s) -> {return true;} ;
		 System.out.println(se.equals(se));
//==============================================================================================		 
		// String lent (String length); 
		 
		 Integerly in = data -> {return data.length();};
		 System.out.println(in.lent("mamammamammammamamammama"));
	}

}
