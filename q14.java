package MSE1;
import java.util.*;

public class q14 {
	public static String revWithStack(String s)
	{
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
		String rev="";
		while(!st.isEmpty())
		{
			rev+=st.pop();
		}
		return rev;
	}
	
	public static String revWithoutStack(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("With stack: "+revWithStack(s));
		System.out.println("Without stack: "+revWithoutStack(s));
		sc.close();
	}

}
