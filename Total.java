class Student{

	int rollno;
	String name;
	Student(int r,String n){
		rollno=r;
		name=n;
	}

	void putdata(){
		System.out.println("Name:" +name+ "Roll no:" +rollno);
	}
}

class Marks extends Student{

	int marks1;
	int marks2;
	Marks(int r, String n, int m1, int m2){
		super(r,n);
		marks1=m1;
		marks2=m2;
	}

	void putmarks(){
		System.out.println("Marks of subject1=" +marks1+"\nMarks of subject 2="+ marks2);
	}
}

class Total extends Marks{

	int total;
	Total(int r,String n,int m1,int m2){
		super(r,n,m1,m2);
		total = marks1+marks2;
	}

	void display(){
		System.out.println("Total=" +total);
	}

	public static void main(String args[]){
		Total obj=new Total(5,"Rajesh",50,60);
		obj.putdata();
		obj.putmarks();
		obj.display();
	}
}





