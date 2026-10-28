package MSE1;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//$100, $150 and $200 are deposited in banks A, B and C respectively. 
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
//Call this method by creating an object of each of the three classes.


abstract class Bank{
	abstract double getBal();
}
class BankA extends Bank
{
	public double getBal()
	{
		return 100;
	}
}

class BankB extends Bank{
	public double getBal()
	{
		return 200;
	}
}

class BankC extends Bank{
	public double getBal()
	{
		return 300;
	}
}
public class q7 {

	public static void main(String[] args) {
		Bank a=new BankA();
		Bank b=new BankB();
		Bank c=new BankC();
		System.out.println("Balance in Bank A is: "+a.getBal());
		System.out.println("Balance in Bank B is: "+b.getBal());
		System.out.println("Balance in Bank C is: "+c.getBal());
		
	}

}
