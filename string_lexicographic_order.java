package dsa;
import java.util.*;
public class string_lexicographic_order {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s1.compareTo(s2));
		System.out.println(compareTo(s1,s2));
	}
	public static int compareTo(String s1, String s2)
	{
		if(s1==s2)
		{
			return 0;
		}
		int len=Math.min(s1.length(), s2.length());
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}

}
