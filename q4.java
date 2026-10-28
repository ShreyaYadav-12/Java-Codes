package MSE1;
import java.util.*;
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
//by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.


class Rectangle{
	
	double l,b;
	
	Rectangle(double l, double b)
	{
		this.l=l;
		this.b=b;
	}
	public double area()
	{
		return l*b;
	}
}

public class q4 {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		System.out.println("Area of rectangle 1 is: "+r1.area());
		System.out.println("Area of rectangle 2 is: "+r2.area());
	}

}
