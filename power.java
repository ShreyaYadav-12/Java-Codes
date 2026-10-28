package lec19;
import java.util.*;
public class power { // eg of head recursion bcs recursion se wapas ate wakt ans mil raha hai

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(power(a,b));
	}
	public static int power(int a, int b) // returns a^b
	{
		if(b==0)
		{
			return 1;
		}
		return a*power(a,b-1);
	}

}
