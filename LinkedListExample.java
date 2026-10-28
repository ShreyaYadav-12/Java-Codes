package oops;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> employees=new LinkedList();
		employees.add("John"); // add at end
		employees.add(1,"Raj"); // add at index
		employees.addFirst("Sophia"); // add at beginning
		employees.addLast("Arjun"); // add at end
		
		System.out.println("Employees after adding: "+employees);
		
		System.out.println("Get first: "+employees.getFirst());
		System.out.println("Get last: "+employees.getLast());
		System.out.println("Get index 2: "+employees.get(2)); // get(index)
		
		employees.remove();     //removes first
	    employees.remove("Raj"); 
	    employees.remove(1);
	    employees.removeFirst();
	    employees.removeLast();
	}

}
