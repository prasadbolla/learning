/**
 * 
 */
package java8learning.sortwithjava8inbuilt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author PRASADBolla
 *
 */
public class Java8Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = Arrays.asList(

				"Milan",

				"london",

				"San Francisco",

				"Tokyo",

				"New Delhi"

		);

		System.out.println(cities);

		// [Milan, london, San Francisco, Tokyo, New Delhi]
		cities.sort(String.CASE_INSENSITIVE_ORDER);


		System.out.println(cities);

		// [london, Milan, New Delhi, San Francisco, Tokyo]
		
		cities.sort(Comparator.naturalOrder());

		System.out.println(cities);

		// [Milan, New Delhi, San Francisco, Tokyo, london]
		
		cities.sort(Comparator.reverseOrder());
		System.out.println(cities);

		List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9);

		System.out.println(numbers); // [6, 2, 1, 4, 9]

		numbers.sort(Comparator.naturalOrder());

		System.out.println(numbers); // [1, 2, 4, 6, 9]
		
		
		List<Movie> movies = Arrays.asList(
		        new Movie("Lord of the rings"),

		        new Movie("Back to the future"),

		        new Movie("Carlito's way"),

		        new Movie("Pulp fiction"));

		movies.sort(Comparator.comparing(Movie::getTitle));

		movies.forEach(System.out::println);
		
/*		movies.sort(new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return m1.getTitle().compareTo(m2.getTitle());
			}
		});*/
		movies.sort((item1, item2) ->{
			return item1.getTitle().compareTo(item2.getTitle());
		});
		System.out.println("Latest List");
		movies.forEach(System.out::println);
	}

}
