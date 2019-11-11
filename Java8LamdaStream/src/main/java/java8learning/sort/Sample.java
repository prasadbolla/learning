package java8learning.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
	
	public static void main(String a[]) {
		ArrayList<Test> al=new ArrayList<Test>();  
		al.add(new Test("Vijay",23));  
		al.add(new Test("Ajay",27));  
		al.add(new Test("Jai",21));  
		Collections.sort(al);  
		for(Test st:al){  
		System.out.println(st.getAmount()+" "+st.name+" "+st.getName());  
		}  
	}

}
