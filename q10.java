package MSE1;
import java.util.*;
public class q10 {
	public static int freq(String text, String word)
	{
		String tokens[]=text.split("\\s+");
		List<String> list=new ArrayList<>(Arrays.asList(tokens));
		int c=0;
		for(String w:list)
		{
			if(w.equals(word))
			{
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		String s="This is a test string this is test";
		System.out.println("Freq of test is: "+freq(s,"is"));
		

	}

}
