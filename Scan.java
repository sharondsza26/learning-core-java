import java.util.Scanner;
class Scan
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		String n=sc.next();
		System.out.println("Enter Roll No.");
		int r= sc.nextInt();
		System.out.println("Enter marks in 2 subjects");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int avg= (m1+m2)/2;
		System.out.println("Student Details");
		System.out.println("Name: " +n);
		System.out.println("Roll No.: " +r);
		System.out.println("Subject 1 marks: " +m1);
		System.out.println("Subject 2 marks: " +m2);
		System.out.println("Average marks: " +avg);
	}
}	