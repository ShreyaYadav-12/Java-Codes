package dsa;

import java.util.Scanner;

public class maxSumofSubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt(); //user input
		}
		int sum1=0,ans1=0;
		for(int i=0;i<n;i++) //kadane's algo for straight subarray
		{
			sum1+=arr[i];
			if(sum1>ans1)
			{
				ans1=sum1;
			}
			if(sum1<0)
			{
				sum1=0;
			}
		}
		int op1=ans1;
		int ans2=0, totalSum=0; //circular subarray
		for(int i=0;i<n;i++)
		{
			totalSum+=arr[i]; //total sum of array
			arr[i]*=-1; //flipping sign of each element
		}
		int sum2=0; 
		for(int i=0;i<n;i++) //max sum of flipped array= min sum of original array
		{
			sum2+=arr[i];
			if(sum2<0)
			{
				sum2=0;
			}
			if(sum2>ans2)
			{
				ans2=sum2;
			}
		}
		int op2=totalSum+ans2;
		System.out.println(op1);
		System.out.println(op2);
	}
}
