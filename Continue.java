class Continue
{
	public static void main(String[] args)
	{
		int a=0;
		while(a<15)
		{
			if(a==5)
			{
				a=a+1;
				continue;  //break;
			}
			
			else
			{
				a=a+1;
			}
		System.out.println(a);
		}

	}

}
