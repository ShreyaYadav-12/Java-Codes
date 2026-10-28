package lec19;
import java.util.Scanner;
public class print_increasing { // eg of head recursion

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PI(n);
	}
	public static void PI(int n)
	{
		if(n==0)
		{
			return; // whenever return type is void we write just return, no value with it
		}
		PI(n-1);
		System.out.println(n);
	}

}
