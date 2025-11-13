
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoProcessing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("pune");
		cities.add("Mysore");
		cities.add("Banglore");
				
		cities.forEach(str -> System.out.println(str));

		//System.out.println(cities );
		List<String>citiesWithM = new ArrayList<String>();
		
		for (String city : cities) {
			if(city.startsWith("M")) {
				citiesWithM.add(city);	
			}
		}
					
		System.out.println(citiesWithM );
		
		
		Stream<String> streamCities = cities.stream();
		Stream<String> filteredStream = streamCities.filter(c->c.startsWith("M"));
		List<String> li = filteredStream.toList();
		
		
		// i want new list in which cities namelength 5 or more than 5
		streamCities = cities.stream();
		Stream<String> filteredLength = streamCities.filter(c->c.length()>=5);
		List<String> li1 = filteredLength.toList();
		System.out.println("Length more than 5: "+ li1);
		
		//or
		
		li = cities.stream()
						 .filter(c->c.length()>=5)
						 .toList();
					

		
		List<Integer> citiesLength = new ArrayList<Integer>();
		for (String city : citiesWithM) {		
			citiesLength.add(city.length());		
	}
		System.out.println(citiesLength);

		
		streamCities = cities.stream();
		Stream<Integer>lengthStream =streamCities.map(s->s.length());
		citiesLength = lengthStream.toList();
		
		//or
		//this is the most easiest way shortcut
		citiesLength = cities.stream()
							.map(s-> s.length())
							.toList();
		
	}
}
