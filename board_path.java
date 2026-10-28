package lec21;

public class board_path { // look at notes of lec21 in copy for question

	public static void main(String[] args) {
		int n=4;
		printans(n,0,"");
	}
	public static void printans(int n, int curr, String ans)
	{
		if(curr==n)
		{
			System.out.print(ans+" ");
		}
		if(curr>n)
		{
			return;
		}
		printans(n,curr+1,ans+1);
		printans(n,curr+2,ans+2);
		printans(n,curr+3,ans+3);
	}
}
