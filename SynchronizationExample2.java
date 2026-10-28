package oops;

class Bankaccount{ // program to demonstrate the need for synchronization. Without synchronization har baar alag output ata hai, alag order mein, which leads to logical errors
	int balance=5000;
	
	void withdraw(int amount) 
	{
		synchronized(this) // wrapping only the required block under SYNCHRONIZED not the whole method. Isse data inconsistent nahi hoga, transaction logical order se hoga
		{
		if(balance>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" is withdrawing");
			balance-=amount;
			System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance: "+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" - Not enough balance");
		}
	}
}
}

class WithdrawThread extends Thread{
	Bankaccount account;
	int amount;
	
	WithdrawThread(Bankaccount account, int amount)
	{
		this.account=account;
		this.amount=amount;
	}
	
	public void run()
	{
		account.withdraw(amount);
	}
}
public class SynchronizationExample2 {

	public static void main(String[] args) {
		Bankaccount b1=new Bankaccount();
		
		WithdrawThread t1=new WithdrawThread(b1, 4000);
		WithdrawThread t2=new WithdrawThread(b1, 3000);
		
		t1.start(); // start function use karne se "thread 1 is running" likh ke ata hai
		t2.start(); // run function use karne se "main is running" likh ke ata hai

	}

}
