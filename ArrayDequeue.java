package oops;
import java.util.ArrayDeque;
public class ArrayDequeue {

	public static void main(String[] args) {
		ArrayDeque deque=new ArrayDeque();
		deque.add("A");
		deque.addFirst("F");
		deque.addLast("L");
		
		System.out.println("First element peek "+ deque.peek());
	    System.out.println("first element peek "+ deque.peekFirst());
	    System.out.println("last element peek "+ deque.peekLast());

	    System.out.println("Removing elements");
	    System.out.println("remove first "+deque.removeFirst());
	    System.out.println("remove last "+deque.removeLast());
	    System.out.println("poll first "+deque.pollFirst());		
	}

}
