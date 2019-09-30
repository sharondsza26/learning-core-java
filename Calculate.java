abstract class Area{

	abstract void area(double r);
	abstract void area(int side);
	abstract void area(int l,int b);
}

class Calculate extends Area{

	void area(double r){
	double a=3.14*r*r;
	System.out.println("Area of Circle=" +a);
	}

	void area(int side){
	int a=side*side;
	System.out.println("Area of Square=" +a);
	}

	void area(int l, int b){
	int a=l*b;
	System.out.println("Area of Rectangle="+ a);
	}

	public static void main(String args[]){
	
	Calculate obj=new Calculate();
	obj.area(4.5);
	obj.area(5);
	obj.area(5,10);
	}
}