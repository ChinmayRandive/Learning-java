import java.util.TreeMap;
import java.util.Map;

public class DemoTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> cities;
		cities = new TreeMap<Integer,String>();
		cities.put(11,"mumbai");
		cities.put(22, "kolkata");
		cities.put(33,"pune");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));
		System.out.println(cities.containsValue("mumbai"));
		
		// duplicate key not allowed
		cities.put(11, "Banglore");
		System.out.println(cities);
		
		// duplicate value is allowed
		cities.put(20, "chennai");
		System.out.println(cities);
		
		cities.clear();
	}

}
