package oops;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
	
	        Stack <Integer> st=new Stack<>();

	        st.push(1);
	        st.push(10);
	        st.push(2);
	        st.push(5);
	        st.push(6);
	        st.push(11);

	        System.out.println(st);

	        System.out.println(st.pop());

	        System.out.println(st.peek());
	        System.out.println(st.size());
	        System.out.println(st.capacity());
	        System.out.println("Index is:"+st.search(1));

	    }
	}