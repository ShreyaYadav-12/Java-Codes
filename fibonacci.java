package lec20;
import java.util.*;
public class fibonacci { // using recursion print n-th fibo term

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n)); 
	}
	public static int fibo(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		int f1=fibo(n-1);
		int f2=fibo(n-2);
		return f1+f2;
	}

}
