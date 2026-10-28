package MSE1;
import java.util.*;
//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
//Length and breadth of rectangle are entered through keyboard.

public class q1 {
	private double length;
	private double breadth;
	
	public void setDim(double l, double b)
	{
	    length=l;
		breadth=b;
	}
	
	public double getArea()
	{
		return length*breadth;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Length: ");
		 double l=sc.nextDouble();
		 System.out.print("Breadth: ");
		 double b=sc.nextDouble();
		 q1 a=new q1();
		 a.setDim(l, b);
		 System.out.println("Area is: "+a.getArea());
		 sc.close();
	}

}
