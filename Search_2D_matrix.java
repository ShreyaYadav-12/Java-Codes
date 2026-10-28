package dsa;
import java.util.*;
public class Search_2D_matrix { // stair-case Search using binary search, leetcode 240

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(); // row
		int n=sc.nextInt(); // column
		int arr[][]=new int[m][n];
		for(int i=0;i<0;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int key=sc.nextInt(); //element to be searched
		
		System.out.println(Search(arr,key));

	}
	public static boolean Search(int[][] arr,int key)
	{
		int row=0;
		int col=arr[0].length-1; // n-1, since arr[0].length=n
		while(row<arr.length && col>=0) // arr.length=m
		{
			if(arr[row][col]==key)
			{
				return true;
			}
			else if(arr[row][col]<key)
			{
				row++;
			}
			else // arr[row][col]>key
			{
				col--;
			}
		}
		return false;
	}

}