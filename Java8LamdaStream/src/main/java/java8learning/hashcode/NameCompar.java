package java8learning.hashcode;

import java.util.Comparator;

public class NameCompar implements Comparator<StudentComparable>{

	@Override
	public int compare(StudentComparable o1, StudentComparable o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	

}
