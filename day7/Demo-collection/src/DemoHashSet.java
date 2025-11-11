import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>cities;
		cities = new HashSet<String>();
		cities.add("mumbai");
		cities.add("pune");
		System.out.println(cities);
		System.out.println(cities.size());
		cities.add("mumbai");
		System.out.println(cities);
		System.out.println(cities.contains("mumbai")); // boolean true
		//no index method
		//System.out.println(cities.get(0));
		//cities.add(1,"Delhi");
		cities.clear();
	}

}
