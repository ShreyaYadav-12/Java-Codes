package oops;

class ThreadExample3 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(2000); // time in milliseconds
			}
			catch(InterruptedException e){
				System.out.println(e);		
			}
			System.out.println(Thread.currentThread().getName()+" is running");
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		ThreadExample3 t1=new ThreadExample3();
		t1.setName("First Thread");
		t1.start();
		
		ThreadExample3 t2=new ThreadExample3();
		t2.setName("Second Thread");
		t2.start();
		
		
	}

}
