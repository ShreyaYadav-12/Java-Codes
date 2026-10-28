package oops;
class BankAccount{ // program to demonstrate the need for synchronization(remove synchronized keyword before withdraw method to see how code works without synchronization). Without synchronization har baar alag output ata hai, alag order mein, which leads to logical errors
	int balance=5000;
	
	synchronized void withdraw(int amount) // sirf "synchronized" keyword likhna hai before the method name
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

class WithdrawThreads extends Thread{
	BankAccount account;
	int amount;
	
	WithdrawThreads(BankAccount account, int amount)
	{
		this.account=account;
		this.amount=amount;
	}
	
	public void run()
	{
		account.withdraw(amount);
	}
}
public class SynchronizationExample {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		
		WithdrawThreads t1=new WithdrawThreads(b1, 4000);
		WithdrawThreads t2=new WithdrawThreads(b1, 3000);
		
		t1.start(); // start function use karne se "thread 1 is running" likh ke ata hai
		t2.start(); // run function use karne se "main is running" likh ke ata hai

	}

}
