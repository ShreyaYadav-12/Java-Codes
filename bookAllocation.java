package dsa;
import java.util.*;         // QUESTION  https://codeskiller.codingblocks.com/problems/1365   
public class bookAllocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] pages=new int[n];
		for(int i=0;i<n;i++)
		{
			pages[i]=sc.nextInt(); //elements of array represent pages of books
		}
		Arrays.sort(pages);
		System.out.println(minPages(pages,m));
	}
	public static int minPages(int[] pages,int m)
	{
		int low=0;
		int high=0; //high=sum of all pages
		for(int i=0;i<pages.length;i++)
		{
			high+=pages[i];
		}
		int ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(isitpossible(pages,m,mid)==true)
			{
				ans=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] pages, int m, int mid)
	{
		int student=1;
		int pagesRead=0;
		for(int i=0;i<pages.length;i++)
		{
		if(pagesRead+pages[i]<=mid)
		{
			pagesRead+=pages[i];
		}
		else {
			student++;
			pagesRead=0;
		}
		if(student>m)
		{
			return false;
		}
	}
		return true;
	}

}
