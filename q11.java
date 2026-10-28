package MSE1;
import java.util.*;
public class q11 {
	public static String max(String text)
	{
		String tokens[]=text.split("\\s+");
		List<String> list=new ArrayList<>(Arrays.asList(tokens));
		String max="";
		for(String word:list)
		{
			if(word.length()>=max.length())
			{
				max=word;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(max("the longest word in this sentence is"));
	}

}
