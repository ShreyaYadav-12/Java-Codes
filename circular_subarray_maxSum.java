package lec18;
import java.util.*;
public class circular_subarray_maxSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(maxsum(arr));
	}
	public static int maxsum(int[] arr)
	{
		int linear_sum=KadenesAlgo(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i]; // sum of whole array
			arr[i]=arr[i]*-1; // inverting sign of entire array STEP-1
		}
		int min=KadenesAlgo(arr);
		int circular_sum=sum+min; // pure array ke sum mein se minimum sum subtract karliya(i.e. add the max negative sum) STEP-2
		if(circular_sum==0)
        {
            return linear_sum; // if all elements are -ve, then we give the smallest no. instead of 0
        }
		return Math.max(linear_sum, circular_sum);
	}
	public static int KadenesAlgo(int[] arr)
	{
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			ans=Math.max(sum, ans);
			if(sum<0)
			{
				sum=0;
			}
		}
		return ans;
	}

}
