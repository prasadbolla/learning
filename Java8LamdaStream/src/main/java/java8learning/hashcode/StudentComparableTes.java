/**
 * 
 */
package java8learning.hashcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author PRASADBolla
 *
 */
public class StudentComparableTes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		
		
		ArrayList<StudentComparable> al = new ArrayList<StudentComparable>();
		al.add(new StudentComparable(101, "Vijay"));
		al.add(new StudentComparable(106, "Ajay"));
		al.add(new StudentComparable(105, "Jai"));

		Collections.sort(al);
		for (StudentComparable st : al) {
			System.out.println(st.getName() + " " + st.getId());
		}
		Collections.sort(al, new IdComparat());
		for (StudentComparable st : al) {
			System.out.println(st.getName() + " " + st.getId());
		}
		Collections.sort(al, new NameCompar());
		for (StudentComparable st : al) {
			System.out.println(st.getName() + " " + st.getId());
		}
	}

}
