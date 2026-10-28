package MSE1;

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		super(message);
	}
}

class bank
{
	double amt,currbal;
	bank(double amt, double currbal) throws InsufficientBalanceException
	{
		if(amt>currbal)
		{
			throw new InsufficientBalanceException("Insufficient balance");
		}
		this.amt=amt;
		this.currbal=currbal;
		System.out.println("Balance is: "+(currbal-amt));
	}
}

public class q18 {

	public static void main(String[] args) {
		try {
			bank b1=new bank(500,5799);
			bank b2=new bank(5000, 500);
		}
		catch(InsufficientBalanceException e){
			System.out.println("Custom exception: "+e);
		}

	}

}
