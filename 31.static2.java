class D
{
	static int d=1;
	D()
	{
		d++;
	}
	void disp()
	{
		System.out.println("d="+d);
	}
}
class static2
{
	public static void main(String args[])
	{
		D d1,d2,d3;
		d1=new D();
		d1.disp();
		d2=new D();
		d2.disp();
		d3=new D();
		d3.disp();
	}
}
