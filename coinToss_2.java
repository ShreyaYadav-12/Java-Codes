package lec20;

public class coinToss_2 { // all possible outcomes when n coins tossed except NO TWO CONSEQUENT HEADS

	public static void main(String[] args) {
		int n=3;
		coinToss2(n,"");
		System.out.println(count);

	}
	static int count=0;
	public static void coinToss2(int n, String ans)
	{
		if(n==0)
		{
			System.out.println(ans);
			count++;
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H')
		{
			coinToss2(n-1,ans+"H");
		}
		coinToss2(n-1,ans+"T");
	}

}
