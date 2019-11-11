/**
 * 
 */
package java8learning.sortwithjava8inbuilt;

/**
 * @author PRASADBolla
 *
 */
public class Movie {
	public Movie(String string) {
		this.title = string;
	}

	String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie [title=" + title + "]";
	}

}
