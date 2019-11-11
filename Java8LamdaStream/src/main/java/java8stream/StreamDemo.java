/**
 * 
 */
package java8stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author PRASADBolla
 *
 */
public class StreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[]{"a", "b", "c"};
		int[] arrInt = new int[]{1,2,4,3,2,5,4};
/*		IntStream stream = Arrays.stream(arrInt);
		
		System.out.println(stream.toString());*/
		
		//stream = Stream.of("d", "a", "b", "c");
		//System.out.println(stream);
		List stringList = Arrays.asList(arr);
		List arrLists= new ArrayList();
		  arrLists.addAll(Arrays.asList(arrInt));
		  
		  Set<Integer> sortedSet1 = new LinkedHashSet<>();
		  sortedSet1.add(2);
		  sortedSet1.add(1);
		  sortedSet1.add(3);
		  
		System.out.println("String comparision::"+stringList.stream().anyMatch(element -> element.equals("a")));
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,3,2,5,4));
		System.out.println("integerComprision"+list.stream().anyMatch(e-> e.equals(2)));
		List<Integer> list3 = new ArrayList<>( 
	            Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5)); 
		Collections.sort(list3);
		Set<Integer> sortedSet = new LinkedHashSet<>(list3);
		sortedSet.stream().forEach(System.out::println);
		
		
		Set<Integer> set= new HashSet(list3);
		list3.clear();
		list3.addAll(set);
		System.out.println(list.stream().distinct().count());
		System.out.println(list.stream().anyMatch(e -> e.equals(2)));
		 
		 List newList = (List) list.stream().distinct().collect(Collectors.toList()); 
		 
		 newList.stream().forEach(System.out::println);
	}


}
