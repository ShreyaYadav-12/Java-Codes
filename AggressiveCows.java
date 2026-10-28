package dsa;
import java.util.*;
public class AggressiveCows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //number of stalls
		int c=sc.nextInt(); //no of cows
		int[] stall=new int[n];
		for(int i=0;i<n;i++) // input for position of stalls
		{
			stall[i]=sc.nextInt();
		}
		Arrays.sort(stall); // to get sorted distance line jispe hum binary search lagaenge
		System.out.println(largest_min_distance(stall, c));
	}
	public static int largest_min_distance(int[] stall, int c)
	{
		int low=0;
		int high=stall[stall.length-1]-stall[0];
		int ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(isitpossible(stall,c,mid)==true)
			{
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] stall, int c, int mid) //mid is the value of min distance bw 2 cows, c is no of cows
	{
		int cow=1; // ek cow ko toh 1st stall pe baithana hi hoga, compulsory hai
		int pos=stall[0];
		for(int i=1;i<stall.length;i++)
		{
			if(stall[i]-pos>=mid)
			{
				cow++;
				pos=stall[i];
			}
			if(cow==c)
			{
				return true;
			}
		}
		return false;
	}

}
