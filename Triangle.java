import java.util.Scanner;

class Area
{
	void area(int b,int h)
	{
		double a=0.5*b*h;
		System.out.println("Area= " +a);
	}
}

class Triangle
{
	public static void main(String args[])
	{
		Area a1= new Area();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter breadth and height");
		int b=sc.nextInt();
		int h=sc.nextInt();
		a1.area(b,h);
	}
}