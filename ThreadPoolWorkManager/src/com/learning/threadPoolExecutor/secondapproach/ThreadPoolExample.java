package com.learning.threadPoolExecutor.secondapproach;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 
public class ThreadPoolExample 
{
    public static void main(String[] args) 
    {
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3,60000L,TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
        for (int i = 1; i <= 7; i++) 
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());

    		System.out.println("Number Completed Task count in ThreadPool: "+ executor.getCompletedTaskCount());
    		System.out.println("Number Active Thread count in ThreadPool: " + executor.getActiveCount());
    		if(executor.getQueue() != null)
    			System.out.println("Number Active Queue count in ThreadPool: " + executor.getQueue().size());
            executor.execute(task);
            System.out.println("Done");
        }
       
        executor.shutdown();
    }
}