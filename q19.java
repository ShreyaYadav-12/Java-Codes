package MSE1;
import java.util.*;

class Prod{
	private int price;
	private String name;
	private int pin=1111;
	
	public void setter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter prod name: ");
		String prodName=sc.nextLine();
		System.out.println("Enter prod price: ");
		int prodPrice=sc.nextInt();
		
		System.out.println("Enter prod pin: ");
		int prodPin=sc.nextInt();
		if(prodPin==pin)
		{
			name=prodName;
			price=prodPrice;
			System.out.println("Product detrails saved");
		}
		else {
			System.out.println("invalid pin");
		}
	}
	
	public void getter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin to see details: ");
		int prodPin=sc.nextInt();
		if(prodPin==pin)
		{
			System.out.println(name);
			System.out.println(price);
		}
		else
		{
			System.out.println("Wrong pin, no details");
		}
	}
}

public class q19 {

	public static void main(String[] args) {
		Prod p=new Prod();
		p.setter();
		p.getter();

	}

}
