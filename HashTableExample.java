package oops;
import java.util.Hashtable;
public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> table=new Hashtable<>();
		table.put(1,"ABC");
		table.put(4, "xyz");
		table.put(1, "dfg"); // over writes existing value of key 
		System.out.println("Our hashtable is: "+table);
		System.out.println(table.putIfAbsent(4,"djy")); // doesnt over write, only adds value if some value is not already present at the key
		System.out.println(table.putIfAbsent(3,"djy"));
		System.out.println(table);
	}

}
