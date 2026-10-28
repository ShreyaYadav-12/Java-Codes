package dsa;

public class string_equals {

	public static void main(String[] args) {
		String s1="hi";
		String s2=new String("hi");
		System.out.println(s1==s2); // address compare hue
		System.out.println(s1.equals(s2)); //string (content) compare hua
		System.out.println(equals(s1,s2));

	}
	public static boolean equals(String s1, String s2)
	{
		if(s1==s2) // if address hi match h gaya then no need to compare baki content, be smart!
		{
			return true;
		}
		if(s1.length() != s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false; // no need for break here bcs break se loop se bahar ate hain, lekin return toh pure function frame se hi bahar kardeta hai. 
				//i.e., equals function se hi bahar chale jaenge
			}
		}
		return true; // agar loop chal gaya pura then true
	}

}
