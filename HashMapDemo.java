package dsa;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		// put
		map.put("Raj", 98); // complexity=O(1)
		map.put("Raman", 81);
		map.put("Krish", 90);
		map.put("Vishal", 77);
		map.put("Ankit", 56);
		map.put("Pooja", 88);
		map.put("Karan", 79);
		map.put("Punit", 74);
		map.put("Raman", 56); // value gets updated, no new key is made, i.e, no duplicate keys. But values can be duplicate, for eg, more than one person has same marks
		map.put(null, 78); // only 1 null key is allowed
		map.put(null,  89); // value of null gets updated
        System.out.println(map);
		
		// check if map contains value
		System.out.println(map.containsKey("Aniket")); // cpmplexity= O(1)
		System.out.println(map.containsKey("Ankit"));
		
		//get, kisi key ke corresponding kya value hai
		System.out.println(map.get("Aniket")); // O(1)
		System.out.println(map.get("Ankit")); 
		
		// remove
		System.out.println(map.remove("Aniket")); // O(1)
		System.out.println(map.remove("Ankit"));
		System.out.println(map);
		
		//size
		System.out.println(map.size());
	}

}
