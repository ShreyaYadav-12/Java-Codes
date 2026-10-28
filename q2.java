package MSE1;
import java.util.*;
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' without any parameter in its constructor.

//public class q2 {
//	
//	private double a,b,c;
//	
//	public q2()
//	{
//		this.a=3;
//		this.b=4;
//		this.c=5;
//	}
//	public double perimeter()
//	{
//		return a+b+c;
//	}
//	
//	public double area()
//	{
//		double s=perimeter()/2;
//		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
//	}
//	
//	public static void main(String[] args)
//	{
//		q2 t=new q2();
//		System.out.println("Perimeter is: "+t.perimeter());
//		System.out.println("Area is: "+t.area());
//		
//	}
//}


//both codes correct



class Triangle {
    private double a, b, c;
    public Triangle()
    { a=3; b=4; c=5; 
    }
    public double perimeter()
    { return a+b+c; 
    }
    public double area()
    {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

public class q2 {
    public static void main(String[] args){
        Triangle t = new Triangle();
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
    }
}