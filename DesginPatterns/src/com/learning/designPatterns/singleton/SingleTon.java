/**
 * 
 */
package com.learning.designPatterns.singleton;

/**
 * @author PRASADBolla
 *
 */
class SingleTon {
	private static SingleTon obj;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (obj == null) {
			synchronized (SingleTon.class) {
				if (obj == null) {
					obj = new SingleTon();// instance will be created at request
											// time
				}
			}
		}
		return obj;
	}
}
