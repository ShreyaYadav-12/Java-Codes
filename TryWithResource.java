package oops;
import java.util.*;
public class TryWithResource {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.print("Enter name");
		}
	}

}
