import java.util.*;

class StringBuff{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str =sc.next();
		StringBuffer s1=new StringBuffer(str);
		StringBuffer s2=new StringBuffer(str);
		s2.reverse();
		if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}