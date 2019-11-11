package java8learning.sort;

/**
 * @author PRASADBolla
 *
 */
public class Test implements Comparable<Test> {
	public Test(String string, int i) {
		this.name = string;
		this.amount = i;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	String name;
	int amount;

	@Override
	public int compareTo(Test st) {

		if (amount == st.amount)
			return 0;
		else if (amount > st.amount)
			return 1;
		else
			return -1;

	}

}
