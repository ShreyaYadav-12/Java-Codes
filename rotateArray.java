package dsa;
import java.util.*;
public class rotateArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		rotate(a,n,x);
		for(int i=0;i<n;i++)
		{
		System.out.print(a[i]+" ");
	}
	}
	public static void rotate(int a[], int n, int x)
	{
		x=x%n;
		for(int j=1;j<=x;j++)
		{
		int temp=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=temp;
		}
	}

}
