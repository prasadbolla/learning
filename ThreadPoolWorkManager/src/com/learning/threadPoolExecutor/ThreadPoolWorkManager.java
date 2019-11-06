/**
 * 
 */
package com.learning.threadPoolExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author PRASADBolla
 *
 */
public class ThreadPoolWorkManager {
	private static ThreadPoolExecutor threadPoolExecutor = null;

	public ThreadPoolWorkManager() {

	}
	public static void init(){
		//1 way of creating the threadPoolExecutor with fixed threadPool
		threadPoolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(30);
		
		//2 way of createing the threadpool executor
		threadPoolExecutor = new ThreadPoolExecutor(5, 20,60000L,TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
	}
	
/*	public static WorkItemResponse execute(Work work){
		
	}*/
}
