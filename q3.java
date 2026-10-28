package MSE1;
import java.util.*;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' with constructor having the three sides as its parameters.
public class q3 {
	
	double a,b,c;
	
	q3(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double peri()
	{
		return a+b+c;
	}
	public double area()
	{
		double s=peri()/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public static void main(String[] args) {
		q3 a=new q3(3,4,5);
		System.out.println("Perimeter is: "+a.peri());
		System.out.println("Area is: "+a.area());
	}

}
