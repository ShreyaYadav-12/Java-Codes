package dsa;

public class fun_demo2 {
	public static int val=100; //global variable, accessible thruout the code
	public static void main(String[] args) {
		int a=10;
		int b=8;
		System.out.println(val);
		System.out.println(add(a,b));
		System.out.println(val);
		
	}
	public static int add(int a, int b)
	{
		int c=a+b;
		val +=5;
		return c;
	}

}
