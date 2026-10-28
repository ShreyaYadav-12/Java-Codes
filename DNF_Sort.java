package lec18;
import java.util.*; // Dutch National Flag (DNF)
public class DNF_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		DNF(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void DNF(int[] arr)
	{
		int left=0;
		int right=arr.length-1;
		int i=0;
		while(i<=right)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[left];
				arr[left]=temp; // swapping arr[i] and arr[left]
				left++;
				i++;
			}
			else if(arr[i]==1)
			{
				i++;
			}
			else
			{
				int temp=arr[i];
				arr[i]=arr[right];
				arr[right]=temp;
				right--;
			}
		}
	}

}
