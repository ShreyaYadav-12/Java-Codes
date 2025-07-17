package dsa;

public class fun_demo3 {
public static int val=100;
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
		fun_demo3.val +=5; //another way to access global variable
		return c;
	}
}
