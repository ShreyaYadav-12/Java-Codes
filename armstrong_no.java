package dsa;
import java.util.*;
public class armstrong_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=0;
		int num=n;
		int num2=n;
		int sum=0;
		while(num>0)
		{
			c++;
			num=num/10;
		}
		while(num2>0)
		{
			int k=num2%10;
			sum += Math.pow(k,c);
			num2/=10;
		}
		if(sum==n)
			System.out.println("true");
		else
			System.out.println("false");
			
	}

}
