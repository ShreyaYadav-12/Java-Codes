package lec19;
import java.util.*;
public class print_both_dec_inc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PB(n);
	}
	public static void PB(int n)
	{
		if(n==0)
		{
			return; // whenever return type is void we write just return, no value with it
		}
		System.out.println(n);
		PB(n-1);
		System.out.println(n);
	}
}
