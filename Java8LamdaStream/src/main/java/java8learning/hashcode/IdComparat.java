package java8learning.hashcode;

import java.util.Comparator;

public class IdComparat implements Comparator<StudentComparable>{

	@Override
	public int compare(StudentComparable o1, StudentComparable o2) {
		if(o1.getId() == o2.getId())
			return 0;
			else if(o1.getId() > o2.getId())
				return 1;
			else return -1;
	}

}
