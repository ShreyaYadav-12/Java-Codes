package oops;

class ThreadExample extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getName()+" is running");
	}
}
}
public class ThreadDemo {

	public static void main(String[] args) {
		ThreadExample t1=new ThreadExample();
		t1.start();
		ThreadExample t2=new ThreadExample();
		t2.start();
		ThreadExample t3=new ThreadExample();
		t3.start();
		
		
	}

}
