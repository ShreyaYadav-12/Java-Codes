package dsa;
import java.util.*;
public class substring_print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s.substring(2,5)); // makes new string in heap, not pool
		substring(s);
	}
	public static void substring(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}

}
