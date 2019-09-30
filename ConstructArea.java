class ConstructArea
{

	ConstructArea(int a)
	{
		int a1=a*a;
		System.out.println("Area of square= "+a1);
	}

	ConstructArea(int l, int h)
	{
		double c=l*h;
		System.out.println("Area of rectangle= "+c);
	}


	public static void main(String args[])
	{
		ConstructArea a1=new ConstructArea(5);
		ConstructArea a2=new ConstructArea(3,4);
		
	}
	
	
	
}