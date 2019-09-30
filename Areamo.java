import java.util.Scanner;

class Areamo
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of side");
		int a=sc.nextInt();
		System.out.println("Enter breadth and height");
		int b=sc.nextInt();
		int h=sc.nextInt();
		Areamo m=new Areamo();
		m.area(a);
		m.area(b,h);
	}
	
	void area(int a)
	{
		int a1=a*a;
		System.out.println("Area of square= "+a1);
	}

	void area(int b, int h)
	{
		double c=0.5*b*h;
		System.out.println("Area of triangle= "+c);
	}
	
}