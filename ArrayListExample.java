package oops;
import java.util.*; // ArrayList is part of * package

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList fruits= new ArrayList();//any data type

        ArrayList<String> fruits=new ArrayList<>();//Only strings can be inserted now
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("litchi");
        fruits.add("kiwi");
        fruits.add("apricot"); 
        
        System.out.println(fruits);//prints whole list

        for(String s : fruits){
            System.out.println(s);
        }

        Iterator itr=fruits.iterator();
        while(itr.hasNext()) ///check if iterator has more elements
        {            
            System.out.println(itr.next()); //printing the element and move to next
        }


        fruits.add(1,"guava"); // add function inserts new value, shifting baki values aage
        System.out.println(fruits);
        fruits.set(3, "mango");  // set function replaces value at given index
        System.out.println(fruits);
 
        

        System.out.println(fruits.get(3));
        
       fruits.remove(2);
       System.out.println(fruits);
       
       int s= fruits.size();
       System.out.println("the size is: "+s);
       Collections.sort(fruits);
       System.out.println(fruits);
    }
} 
