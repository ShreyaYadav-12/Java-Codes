package lec18; // the two arrays are sorted in ascending order
import java.util.*; // we will look at the path sum before the common elements(from the previous common element to the current common element) and then choose the path with max sum
public class maximum_path_score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			arr2[j]=sc.nextInt();
		}
		System.out.println(maxsum(arr1,arr2));
		
	}
	public static int maxsum(int[] arr1, int[] arr2)
	{
		int i=0; // end pointer for array1
		int s1=0; //start pointer for array1
		int j=0; //end pointer for array2
		int s2=0; //start pointer for array2
		long ans=0; // we take long bcs of leetcode constraint, 10^9+7
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				long sum1=0;
				for(int k=s1;k<=i;k++)
				{
					sum1+=arr1[k];
				}
				long sum2=0;
				for(int k=s2;k<=j;k++)
				{
					sum2+=arr2[k];
				}
				ans=ans+Math.max(sum1, sum2);
				i++;
				j++;
				s1=i; // keeping s1 at same position as i and s2 at j
				s2=j;
			}
		}
			long sum1=0;
			for(int k=s1;k<arr1.length;k++)
			{
				sum1+=arr1[k];
			}
			long sum2=0;
			for(int k=s2;k<arr2.length;k++)
			{
				sum2+=arr2[k];
			}
			ans=ans+Math.max(sum1, sum2);
			int x=(int)(ans%1000_000_007);
			return x;
		}
	}
