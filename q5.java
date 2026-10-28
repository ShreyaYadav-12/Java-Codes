package MSE1;
import java.util.*;

//Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
//with separate methods for each operation whose real and imaginary parts are entered by user.

class Complex {
	double re,im;
	public Complex(double r, double i)
	{
		re=r;
		im=i;
	}
	public Complex add(Complex o)
	{
		return new Complex(re+o.re,im+o.im);
	}
	
	public Complex sub(Complex o)
	{
		return new Complex(re-o.re,im-o.im);
	}
	
	public Complex prod(Complex o)
	{
		return new Complex(re*o.re - im*o.im, re*o.im + im*o.re);
	}
}

	public class q5
	{
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real and imaginary part of number 1:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		System.out.println("Enter real and imaginary part of number 2:");
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		Complex c1=new Complex(a,b);
		Complex c2=new Complex(c,d);
		System.out.println("sum is: "+c1.add(c2));
		System.out.println("diff is: "+c1.sub(c2));
		System.out.println("prod is: "+c1.prod(c2));
		sc.close();
	}

}
