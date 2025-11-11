
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	// it  is same as arraylist we can perform that task here also
	
	
	public static void main(String[] args) {
		List <String>cities;
		cities = new Vector<String>();  //<String> it is generic by that all the warning are removed
		System.out.println(cities.size());

		
		cities.add("Mumbai"); //adding element at last
		cities.add("pune");
		cities.add("Nagpur");
		cities.add("Hydrabad ");
		//cities.add(12);// boxing (primitive to wrapper) // boxing is happening automatically

		System.out.println("Before:"+cities);
		Collections.sort(cities);
		System.out.println("After:"+cities);

		System.out.println(cities.size()); //number of elements
		System.out.println(cities);
		cities.add(1,"delhi"); // adding at given index
		System.out.println(cities);
		System.out.println(cities.size());  // number of elements
		System.out.println(cities.get(1));
		
		cities.remove(1);// remove element from  given index
		System.out.println(cities.size());
		System.out.println(cities);
		cities.clear();
		System.out.println(cities.size());
		System.out.println(cities);
		cities.clear();
		System.out.println(cities.size());  // number of elements
		}
	}


