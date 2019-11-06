package com.learning.threadPoolExecutor;

import java.util.concurrent.Callable;

public class Work implements Callable<Work> {
	public String name;

	public Work(String string) {
		this.name = name;
	}

	@Override
	public Work call() throws Exception {
		return new Work("hello");
	}

}
