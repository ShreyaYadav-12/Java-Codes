package lec16;
import java.util.*;  //https://codeskiller.codingblocks.com/problems/165
public class finding_cb_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();  //we use long bcs string can be upto 14 digits, int ki range 9 digits tak hi hoti hai
		substring(s);
	}
	public static void substring(String s)
	{
		int count=0;
		boolean[] visited= new boolean[s.length()]; // default value of boolean array elements is false
		for(int len=1;len<=s.length();len++)
		{
			for(int j=len;j<=s.length();j++)
			{
				int i=j-len; //j-i=len
				String str=s.substring(i,j); // string number
				// long num=Long.parseLong(str); // long number
				if(isCBnumber(Long.parseLong(str))==true && isVisited(visited,i,j-1)==false)
				{
					count++;
					for(int k=i;k<j;k++)
					{
						visited[k]=true; // marked, cant be sused in another CB number					}
				}
			}
		}
	}
		System.out.println("Max number of CB numbers in string is: "+count);
	}
		public static boolean isVisited(boolean[] visited, int i, int j)
		{
			for(int k=i;k<=j;k++)
			{
			if(visited[k]==true)
			{
				return true;
			}
			}
			return false;
		}
		
		
	public static boolean isCBnumber(long num)
	{
		if(num==0||num==1)
		{
			return false;
		}
		int[] arr= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				return true;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(num%arr[i]==0)
			{
				return false;
			}
		}
		return true;
	}

}
//Finding CB Numbers
//Kartik Bhaiya and Kanak Bhaiya are discussing a special type of number, which they call a Coding Blocks Number (CB Number). A number qualifies as a CB Number based on the following criteria:
//
//
//
//0 and 1 are not considered CB numbers.
//
//The following prime numbers are always CB numbers:
//
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29.
//
//Any other number is a CB number if it is not divisible by any of the numbers listed in point (2).
//
//
//
//The Challenge
//
//Kartik Bhaiya challenges Kanak Bhaiya with a problem:
//
//He provides a string of digits, and Kanak Bhaiya must determine the maximum number of CB numbers that can be extracted from it while following these constraints:
//
//
//1. Non-overlapping Substrings:
//
//
//A CB number cannot be a substring or superstring of another chosen CB number.
//
//Example: In 4991, both 499 and 991 are CB numbers, but we can choose only one of them.
//
//
//2. Valid Substring Selection:
//
//
//The CB number must be a contiguous substring of the given string.
//
//Example: In 481, we cannot select 41 as a CB number because 41 is not a contiguous substring of "481."
//
//
//3. Maximization Goal:
//
//
//Since multiple solutions may exist, the goal is to find the maximum number of CB numbers that can be extracted from the given string.
//
//
//Kanak Bhaiya has a class of Launchpad students to teach and needs help solving this challenge. Assist him in finding the solution.
//
//
//Input format
//
//First line contain size of the string.
//
//
//Next line is A string of digits.
//
//
//Output format
//
//Maximum number of CB numbers that can be formed.
