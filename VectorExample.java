package oops;
import java.util.Vector;
public class VectorExample {

	public static void main(String[] args) {
		Vector <String> vc=new Vector<>(4);
		
		System.out.println(vc.capacity());
		
		vc.add("1");
		vc.add("2");
		vc.add("3");
		vc.add("4");
		vc.add("5");
		
		System.out.println(vc.capacity()); // capacity increases to double as soon as even more element is added apart from the vector's initial capacity
		                                  //  unless you specify that capacity increases by 1 in vector<>(4,1);
		Vector <String> vc2=new Vector<>();
		vc2.add("A");
		vc2.add("Bss");
		vc2.add("C");
		
		System.out.println(vc2);
		
		vc.addAll(vc2);
		System.out.println(vc);
		
		System.out.println(vc.firstElement());
		
		System.out.println(vc.lastElement());
		
		vc.clear();
		System.out.println(vc);
	}

}
