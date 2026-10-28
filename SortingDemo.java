package oops;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(22);
		al.add(51);
		al.add(14);
		al.add(36);
		System.out.println("Arraylist is: "+al);
		
		Collections.sort(al);
		System.out.println("After sorting arraylist is: "+al);
		
	    Integer []array= {2,35,1,8,9};
		System.out.println("Array is: "+Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("After sorting: "+Arrays.toString(array));
	}

}
