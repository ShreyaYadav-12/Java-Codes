package dsa;
import java.util.*;
public class rainWaterTrap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		trap(arr,n);

	}
	public static void trap(int arr[],int n)
	{
		int leftmax[]=new int[n];
		int rightmax[]=new int[n];
		leftmax[0]=arr[0];
		rightmax[n-1]=arr[n-1];
		int area=0;
		for(int i=1;i<n;i++)
		{
			leftmax[i]=Math.max(leftmax[i-1],arr[i]);
		}
		for(int i=n-2;i>=0;i--)
		{
			rightmax[i]=Math.max(rightmax[i+1],arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			area+=Math.min(leftmax[i],rightmax[i])-arr[i];
		}
		System.out.println("The area of trapped rain water is: "+area);
	}

}
