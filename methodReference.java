package oops;
import java.util.*;
class StudentDemo{

    StudentDemo(int n){
        System.out.println("for id : "+n+" student is created.");
    }
    //FOR STATIC METHOD
    // public static void showdetails(int n){
    //     System.out.println(n);
    // }

    //TO CALL NON STATIC METHOD WE HAVE TO CREATE AN OBJECT
    //  public void print(int n){
    //     System.out.println(n);
    // }

}

public class methodReference {
    public static void main(String[] args) {
        List<Integer> ids=Arrays.asList(1,2,3,4,5);


        //calling constructor using method reference (constructor)
        ids.forEach(StudentDemo::new);

        //using lambda expression (static method)
        //ids.forEach(n-> System.out.println(n));

        //using method reference (non static method)
        //ids.forEach(StudentDemo::showdetails);

        // StudentDemo st= new StudentDemo();
        // ids.forEach(st::print);
    }
}