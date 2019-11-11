/**
 * 
 */
package java8learning.hashcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author PRASADBolla
 *
 */
public class HashCodeDemo {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Employee e1 = new Employee();
	        Employee e2 = new Employee();
	 
	        e1.setId(100);
	        e2.setId(100);
	 
	        System.out.println(e1.equals(e2));  //false
	        
	        Set<Employee> employees = new HashSet<Employee>();
	        employees.add(e1);
	        employees.add(e2);
	         
	        System.out.println(employees);  //Prints two objects
	        System.out.println("HashMap's data> "+employees);
	        System.out.println("HashMap's size> "+employees.size());
	        ArrayList list = new ArrayList();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        System.out.println(list);
	        
	        HashSet set = new HashSet();
	        set.add(1);
	        set.add(2);
	        set.add(3);
	        set.add(4);
	        set.add(5);
	        set.add(5);
	        
	        System.out.println(set);
	        
	        HashMap hashmp= new HashMap();
	        hashmp.put(1, 11);
	        hashmp.put(2, 22);
	        hashmp.put(3, 22);
	        hashmp.put(2, 11);
	        System.out.println(hashmp);
	    }

}
