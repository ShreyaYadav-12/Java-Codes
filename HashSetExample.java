package oops;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
        hs.add(11);
        hs.add(2);

        System.out.println("Hash set 1: "+hs);

        HashSet<Integer> hs2= new HashSet<>();

        hs2.add(21);
        hs2.add(12);
        hs2.add(111);
        hs2.add(23);

        System.out.println("Has set 2 : "+hs2);
        
        HashSet<String> hs3=new HashSet<>();
        hs3.add("Apple");
        hs3.add("banana");
        hs3.add("Guava");
        System.out.println(hs3);
System.out.println("----------------------------");
        System.out.println("Apple".hashCode());
        System.out.println("banana".hashCode());
        System.out.println("Guava".hashCode());

	}

}
