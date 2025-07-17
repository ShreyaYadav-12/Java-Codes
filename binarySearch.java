package dsa;
import java.util.*;
public class binarySearch {

	public static void main(String[] args) {
		int a[]= {1,4,5,7,9,12,34};
		int n=a.length;
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int pos=binSearch(a,n,key);
		System.out.println("The position at which 34 "+key+"is found is: "+pos);

	}
	public static int binSearch(int a[],int n, int key)
	{
		int s=0, e=n-1;
		while(s<=e)
		{
			int m=(s+e)/2;
			if(a[m]==key)
			{
				return m;
			}
			else if(key>a[m]) {
				s=m+1;
			}
			else {
				e=m-1;
			}
		}
		return -1;
	}

}
