interface area{

	double arear(int l, int b);
}

interface perimeter{

	double peri(int l, int b);
}

class Calc implements area,perimeter{

	public double arear(int l, int b){
	return(l*b);
	}


	public double peri(int l, int b){
	return(2*(l+b));
	}

	public static void main(String args[]){
	Calc c=new Calc();
	System.out.println(c.arear(15,20));
	System.out.println(c.peri(15,20));
	}
}
	