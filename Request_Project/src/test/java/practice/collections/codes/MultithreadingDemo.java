package practice.collections.codes;

public class MultithreadingDemo extends Thread {
	// Multi threading is a Java feature that allows concurrent execution of two or more 
	// parts of a program for maximum utilization of CPU. Each part of such program is 
	// called a thread. So, threads are light-weight processes within a process.

	// Threads can be created by using two mechanisms : 
	
	// Extending the Thread class 
	// Implementing the Runnable Interface
	
	
	
	// Thread creation by extending the Thread class
	// We create a class that extends the java.lang.Thread class. This class overrides the run() 
	// method available in the Thread class. A thread begins its life inside run() method. 
	// We create an object of our new class and call start() method to start the execution 
	// of a thread. Start() invokes the run() method on the Thread object.
	
	
	// Advantages of Java Multithreading
	// 1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.

	// 2) You can perform many operations together, so it saves time.

	//3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
	
	 public void run()
	    {
	        try {
	            // Displaying the thread that is running
	            System.out.println(
	                "Thread " + Thread.currentThread().getId()
	                + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	 
	// Main Class
	//public class Multithread {
	    public static void main(String[] args) {
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            MultithreadingDemo object = new MultithreadingDemo();
	            object.start();
	        }
	    }
	    
	    
	    
	    
	    
	    
	 // Java code for thread creation by implementing
	 // the Runnable Interface
	// class MultithreadingDemo implements Runnable {
	     public void run2()
	     {
	         try {
	             // Displaying the thread that is running
	             System.out.println(
	                 "Thread " + Thread.currentThread().getId()
	                 + " is running");
	         }
	         catch (Exception e) {
	             // Throwing an exception
	             System.out.println("Exception is caught");
	         }
	     }
	 }
	  
	 // Main Class
	 class Multithread {
	     public static void main(String[] args)
	     {
	         int n = 8; // Number of threads
	         for (int i = 0; i < n; i++) {
	             Thread object
	                 = new Thread(new MultithreadingDemo());
	             object.start();
	         }
	     }
	 }
	
