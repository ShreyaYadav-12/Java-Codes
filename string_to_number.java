package lec16;
import java.util.*; //convert numeric string to number
public class string_to_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next(); 
		int n=Integer.parseInt(s);
		long l=Long.parseLong(s);
		System.out.println(n);
		System.out.println(l);
	}
}
