package dsa;
import java.util.*;
public class Kth_Root {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=binarySearch(n,k); //x^k=n then to find highest value of x if n and k are given
		System.out.println(x);
	}
	public static int binarySearch(int n,int k)
	{
		int low=1,high=n,ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(Math.pow(mid,k)<=n)
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

}
