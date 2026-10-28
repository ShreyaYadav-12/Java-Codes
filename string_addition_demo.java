package dsa;

public class string_addition_demo {

	public static void main(String[] args) {
		String s1="hello";
		String s2="bye";
		String s3=s1+s2; // s3 is formed outside String pool, copies of s1 and s2 are created outside pool. 
//		Eg:hellobye is assigned address 6k and then that 6k is assigned to s3
		String s4=s1+" "+s2;
		String s5=s1.concat(s2);
		String s6="abc"+"def";
		String s7="abc"+s1;
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println("hi"+10+20+"bye"+4+2); // string + anything is treated as string only, yahan numbers ka sum nahi hua
		System.out.println(10+20+"bye"+4+7); // yahan un numbers ka sum hoga jo string se pehle likhe hain, rest are treated as string only
		System.out.println("hi"+(10+20)+"bye"+4+2); // BODMAS rule
	}

}
