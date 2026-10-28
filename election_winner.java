package dsa;
import java.util.*;
public class election_winner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String line=sc.nextLine();
		String[] names=line.split(",");
		
		Map<String,Integer> map=new HashMap<>();
		for(String name: names)
		{
			name=name.trim();
			map.put(name, map.getOrDefault(names, 0)+1);
		}
		String winner="";
		int maxvotes=0;
		for(String name: map.keySet())
		{
			int votes=map.get(name);
			if(votes>maxvotes)
			{
				winner=name;
				maxvotes=votes;
			}
			else if(votes==maxvotes)
			{
				if(name.compareTo(winner)<0)
				{
					winner=name;
				}
			}
		}
		System.out.println(maxvotes+" "+winner);
	}
}
