/**
 * 
 */

/**
 * @author PRASADBolla
 *
 */
public class Patterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "salkdfjsaldkjflsad";
		int[] lastIndexs = new int[26];
		for (int i = 0; i < s.length(); i++) {
			lastIndexs[s.charAt(i) - 'a'] = i;
			System.out.println(s.charAt(i));
		}
		System.out.println("hello");
	}

}
