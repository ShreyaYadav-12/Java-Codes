package MSE1;
import java.util.*;
public class q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			set.add(sc.nextInt());
		}
		if(!set.isEmpty())
		{
			System.out.println("Min element is: "+set.first());
			System.out.println("Max element is: "+set.last());
			
		}
		else {
			System.out.println("set is empty");
		}
		sc.close();
	}

}
