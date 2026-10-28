package oops;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> aiml=new HashMap<>();
		
		aiml.put(1, "Akash");
		aiml.put(2,"Aastha");
		aiml.put(3,"Shreya");
		aiml.put(4,"Varun");
		aiml.put(5,"Shreya"); // values can be duplicate but keys should be unique
		
		aiml.put(3,null); // multiple values can be null, but only 1 key can be null
		aiml.put(4,null);
		aiml.put(null,"Laxmi");
		System.out.println(aiml);
		
		System.out.println("Map elements with for-each loop");
		for(Integer k: aiml.keySet())
		{
			System.out.println(k+" "+aiml.get(k));
		}
		
		System.out.println("traversing via entry");
		for(Map.Entry<Integer, String> entry: aiml.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Iterator<Map.Entry<Integer, String>> itr= aiml.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println("Key: "+ entry.getKey()+",value: "+ entry.getValue());
		}
		
	}

}
