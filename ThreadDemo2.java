package oops; // creating thread

class MyTask implements Runnable{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running");
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyTask task=new MyTask(); // Runnable class ka object
		
		Thread t=new Thread(task); // pass Runnable to Thread
		
		t.start();
		
        MyTask task2=new MyTask(); // Runnable class ka object
		Thread t2=new Thread(task2); // pass Runnable to Thread
		t2.start();
		
		MyTask task3=new MyTask(); // Runnable class ka object
		Thread t3=new Thread(task3); // pass Runnable to Thread
		t3.start();
		
		System.out.println("Current Thread: " +Thread.currentThread().getName());
		

	}

}
