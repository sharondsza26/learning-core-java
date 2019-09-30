class Volume
{
	int le;
	int br;
	int ht;

	Volume(int l,int b,int h)
	{
		le=l;
		br=b;
		ht=h;
	}

	void display(Volume obj)
	{
		int vol=obj.le*obj.br*obj.ht;
		System.out.println("Volume of box=" +vol);
	}

	public static void main(String args[])
	{
		Volume v=new Volume(12,10,11);
		v.display(v);
	}
}