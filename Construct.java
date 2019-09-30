class Construct
{
	int i;
	int sal;
	String name;

	Construct(int id, String n, int s)
	{
		i=id;
		name= n;
		sal=s;
	}

	void display()
	{
	System.out.println("\nEmployee id= "+i+ "\nEmployee name="+name +"\nEmployee salary="+sal);
	}

	public static void main(String args[])
	{
		Construct c= new Construct(112,"Rahul",5000);
		c.display();
	}
}