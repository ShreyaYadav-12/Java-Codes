package lec19;
import java.util.*;
public class print_decreasing { // eg of tail recursion

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PD(n);
	}
	public static void PD(int n)
	{
		if(n==0)
		{
			return; // whenever return type is void we write just return, no value with it
		}
		System.out.println(n);
		PD(n-1);
	}
}
