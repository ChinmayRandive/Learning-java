import java.util.ArrayList;
import java.util.List;

public class DemoProcessing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("pune");
		cities.add("Mysore");
		cities.add("Manglore");
		
		
		cities.forEach(str -> System.out.println(str));

		//System.out.println(cities );
		List<String>citiesWithM = new ArrayList<String>();
		
		for (String city : cities) {
			if(city.startsWith("M")) {
				citiesWithM.add(city);
				
			}
			
		}
				
				
		System.out.println(citiesWithM );
		
		List<Integer> citiesLength = new ArrayList<Integer>();
		for (String city : citiesWithM) {
					
			citiesLength.add(city.length());
				
			
	}
		System.out.println(citiesLength);

	}
}
