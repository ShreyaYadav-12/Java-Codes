package dsa;
import java.util.*;
public class insertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr);
			for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int arr[])
	{
		for(int i=1;i<arr.length;i++) {
			insertLastElement(arr,i);
		}
	}
	public static void insertLastElement(int[] arr, int i) //assuming that last element is not sorted, rest whole array is sorted
	{
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
}
