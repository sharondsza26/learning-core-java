import java.util.Scanner;

class Switch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.AND \n 2.OR \n 3.XOR \n 4.NOT \n 5.SHIFT LEFT \n 6.SHIFT RIGHT					\n");
		System.out.println("Enter Choice\n");
		int ch = sc.nextInt();
		System.out.println("Enter two nos\n");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;

		switch(ch)
		{
			case 1: c= a&b;
				break;

			case 2: c= a|b;
				break;

			case 3: c= a^b;
				break;

			case 4: c= ~a;
				break;

			case 5: c= a<<2;
				break;

			case 6: c= a>>2;
				break;

		       default: System.out.println("INVALID OPTION\n");
				break;
		}
		System.out.println("Output = "+c);
	}
}

