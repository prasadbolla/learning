/**
 * 
 */
package java8learning.hashcode;

/**
 * @author PRASADBolla
 *
 */
public class StudentComparable implements Comparable<StudentComparable>{
	private String name;
	private int id;
	
	public StudentComparable(int i, String string) {
		this.id=i;
		this.name=string;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(StudentComparable sc) {
		if(id == sc.id)
			return 0;
		else if(id>sc.id)
			return 1;
		else
			return -1;
	}
}
