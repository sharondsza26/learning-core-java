import java.util.*;

class Sfit
{

	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		int count=0;
		int i=0;
		String max=" ";
		System.out.println("Enter the string");
		s=sc.nextLine();
		String []arr=new String[50];
		arr=s.split(" ");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i].equals("SFIT"))
			{
				count++;
			}

			if(max.length()<arr[i].length())
			{
				max=arr[i];

			}
		}
		String s1=s.replaceAll("SFIT","St. Francis Institute of Technology");
		String s2=s1.replaceAll(max , "*"+max+"*");
		System.out.println("The string is \n" + s2);
		System.out.println("The count of SFIT is =" +count);
	}
}




	
			
			