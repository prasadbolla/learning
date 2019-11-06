/**
 * 
 */
package com.learning.threadPoolExecutor;

import java.util.concurrent.Future;

/**
 * @author PRASADBolla
 *
 */
public class WorkItemResponse {
	String id;
	String name;
	Future future;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the future
	 */
	public Future getFuture() {
		return future;
	}
	/**
	 * @param future the future to set
	 */
	public void setFuture(Future future) {
		this.future = future;
	}
	/**
	 * @return the result
	 */
	public Object getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(Object result) {
		this.result = result;
	}
	Object result;

}
