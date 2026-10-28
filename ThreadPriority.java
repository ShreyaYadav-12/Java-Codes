package oops;

class PriorityDemo extends Thread{
	public void run()
	{
		System.out.println(getName()+" with priority "+getPriority()+ " is running");
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		PriorityDemo t1=new PriorityDemo();
		PriorityDemo t2=new PriorityDemo();
		PriorityDemo t3=new PriorityDemo();
		PriorityDemo t4=new PriorityDemo();
		PriorityDemo t5=new PriorityDemo();
		
		t1.setPriority(Thread.MIN_PRIORITY); // MIN PRIORITY=1
		t2.setPriority(Thread.NORM_PRIORITY); // NORMAL PRIORITY =5
		t3.setPriority(Thread.MAX_PRIORITY); // MAX PRIORITY=10
		t4.setPriority(4); // we can pass priority directly too
		
		t1.run(); // both run and start work for function calling
		t2.start();
		t3.start();
		t4.start();
		t5.start(); // default priority is 5, i.e. normal priority, agar kuch priority set na karo toh

	}

}
