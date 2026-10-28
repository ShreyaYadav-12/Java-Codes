package dsa;
import java.util.*;
public class Spiral_2dArray { // some error, code not working, lec14 2hr,50 mins

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
		Print(arr);
	}
	public static void Print(int [][]arr)
	{
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int te=arr.length*arr[0].length;
		int c=0; // bcs row goes out of range but column doesnt, so there's repetition in printing elements
		while(c<te)
		{
		for(int i=minc;i<maxc&&c<te;i++)
		{
			System.out.println(arr[minr][i]+" ");
			c++;
		}
		minr++;
		for(int i=minr;i<maxr&&c<te;i++)
		{
			System.out.println(arr[i][maxc]+" ");
			c++;
		}
		maxc--;
		for(int i=maxc;i>=minc&&c<te;i--)
		{
			System.out.println(arr[maxr][i]+" ");
			c++;
		}
		maxr--;
		for(int i=maxr;i>=minr&&c<te;i--)
		{
			System.out.println(arr[i][minc]+" ");
			c++;
		}
		minc++;
	}
	}

}
