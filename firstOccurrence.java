package lec19;
import java.util.*;
public class firstOccurrence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter item to be searched");
		int item=sc.nextInt();
		System.out.println(firstOcc(arr,item,0));
	}
	public static int firstOcc(int[] arr,int item,int index)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==item)
		{
			return index;
		}
		return firstOcc(arr,item,index+1);
	}

}
