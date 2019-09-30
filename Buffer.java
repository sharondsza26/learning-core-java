import java.io.*;
class Buffer
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		System.out.println("Enter name");
		String n= br.readLine();
		System.out.println("Enter roll no");
		int r1= Integer.parseInt(br.readLine());
		System.out.println("Enter fees");
		int f= Integer.parseInt(br.readLine());
		System.out.println("Name: " +n + "Roll no: "+r1 + "Fees: "+f);
	}
}