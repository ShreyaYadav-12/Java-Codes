package lec20;
public class SubSequence {

	public static void main(String[] args) {
		String ques="abc";
		PrintSubSeq(ques,"");
	}
	public static void PrintSubSeq(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0); // 0th character,i.e., "a"
		PrintSubSeq(ques.substring(1), ans); // passing remaining string, leaving the 0th character, i.e., "bc" + a blank string
		PrintSubSeq(ques.substring(1),ans+ch); // passing remaining string, leaving the 0th character, i.e., "bc"+ the 0th char "a"
	}
}
