
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// "mumbai is para-constructor here"
		String city = new String ("Mumbai"); 
		System.out.println(city); // invokes tostring() of String class  //mumbai
		System.out.println(city.length()); // 6
		System.out.println(city.charAt(0)); // M
		System.out.println(city.equals("Mumbai")); // true
		System.out.println(city.equals("mumbai")); // false
		System.out.println(city.equalsIgnoreCase("Mumbai")); // true
		System.out.println(city.substring(2)); //mbai
		System.out.println(city.substring(2,4));//mb 


		String newcity =city.replace('M', 'P');
		System.out.println(newcity);// Pumbai
		System.out.println(city); // Mumbai
		
		// no argument constructor
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println("-----------------------");
		System.out.println(s1.equals(s2));// true
		System.out.println(s1==s2); // false
		
		System.out.println("-----------------------");
		String s3 = "a";
		String s4 = "a";
		System.out.println(s3.equals(s4)); // true
		System.out.println(s3==s4); // true
	} 

}
