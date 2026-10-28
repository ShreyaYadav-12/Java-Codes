package MSE1;

//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. 
//The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat

public class q6 {
	String name;
	int year;
	String add;
	
	q6(String n, int y, String a)
	{
		name=n;
		year=y;
		add=a;
	}
	
	public void display()
	{
		System.out.println(name+"\t"+year+"\t"+add);	
	}

	public static void main(String[] args) {
		q6 e1=new q6("Robert", 1994, "64C- WallsStreat");
		q6 e2=new q6("Sam",2000, "68D- WallsStreat");
		q6 e3=new q6("John", 1999, "26B- WallsStreat");
		System.out.println("Name\tYear\tAddress");
		e1.display();
		e2.display();
		e3.display();
	}

}
