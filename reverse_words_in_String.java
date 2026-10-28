package dsa;
import java.util.*;
public class reverse_words_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse_string(s));
	}
	public static String reverse_string(String s)
	{
		s=s.trim();
		String[] arr=s.split("\s+");
		String ans="";
		for(int i=arr.length-1;i>=0;i--)
		{
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
