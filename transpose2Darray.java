package dsa;
import java.util.*;

public class transpose2Darray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//method 1
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<m;i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// or method 2
		
		//transpose
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<n;j++) // or j=0, bcs diagonal elements dont change
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
			
			// and then display
			for(int ii=0;ii<m;ii++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(arr[ii][j]+" ");
				}
				System.out.println();
			}
			
		}
	}

}
