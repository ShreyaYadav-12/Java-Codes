package lec17;
import java.util.*;
public class arrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		list.add(1,15);
		//list.add(5,50); not possible bcs indices cant be skipped
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.remove(2));//prints the removed element
		System.out.println(list);
		
		list.set(3, 65); //updates element at given index
		System.out.println(list);
		
		System.out.println(list.size());
		
		//sort
		Collections.sort(list);
		System.out.println(list);
		
		//display
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

}
