
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> cities;
		cities = new TreeSet<String>();
		cities.add("Nagpur");
		cities.add("pune");
		cities.add("Mumbai");
		System.out.println(cities);
		System.out.println("==============");
		
		// Iterate using advance for loop
		// using advance for loop we can iterate over collection from begning to end sequencialy
		// we can not modify collection
		// if we want to iterate collection objects and while iterating 
		//if we want to remove a specific element for th e collection we should use Iterator object 
		for(String city:cities) {
			System.out.println(city);
		}
		System.out.println("==============");
		//step1
		Iterator <String>
		i = cities.iterator();
		
		//step2
		while(i.hasNext()) {
			
			String city = i.next();
			System.out.println(city);
			
			if(city.equals("pune"))
				i.remove();
		}
		System.out.println("=============="); 
		System.out.println(cities);

	}
	
	
}
