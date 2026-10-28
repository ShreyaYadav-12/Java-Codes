package lec16;
import java.util.*;
public class print_substring_lengthwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		substring(s);
	}
	public static void substring(String s)
	{
		for(int len=1;len<=s.length();len++)
		{
			for(int j=len;j<=s.length();j++)
			{
				int i=j-len; //j-i=len
				System.out.println(s.substring(i,j));
			}
		}
	}

}
