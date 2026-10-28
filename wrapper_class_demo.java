package lec16;

public class wrapper_class_demo {

	public static void main(String[] args) {
		int a=9; // stacks memory mein a=9 is formed
		Integer a1=9; // heap memory mein address allot hoga, woh address main() [in stacks memory] mein a1 ko assign hoga
		System.out.println(a);
		System.out.println(a1);
		a1=a; //autoboxing
		a=a1; // unboxing
	}

}
