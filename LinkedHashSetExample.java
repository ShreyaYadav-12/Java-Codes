package oops;
import java.util.*;
public class LinkedHashSetExample {
    public static void main(String[] args) {
       LinkedHashSet<Integer> hs= new LinkedHashSet<>(); 
       hs.add(1);
       hs.add(2);
       hs.add(10);

       System.out.println("LinkedHashSet is : "+hs);

       LinkedHashSet<Integer> hs2= new LinkedHashSet<>(); 

       hs2.add(21);
       hs2.add(12);
       hs2.add(111);
       System.out.println("LinkedHashSet is : "+hs2);

    }
}