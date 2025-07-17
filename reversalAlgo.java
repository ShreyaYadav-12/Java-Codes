package dsa;

import java.util.Scanner;

public class reversalAlgo { //rotate array by x places using reversal algorithm

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		reverse(a,0,n-1); // reverse entire array
		reverse(a,0,x-1);//reverse from 0 to x-1
		reverse(a,x,n-1);//reverse from x to n-1
		for(int i=0;i<n;i++)
		{
		System.out.print(a[i]+" ");
	}
	}
	public static void reverse(int a[], int i, int j)
	{
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}

}
