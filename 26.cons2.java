class D
{
	int a,b;
	D(int a,int b)
	{
		System.out.println("constructor");
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("a="+a+"\n b="+b);
	}
}
class cons2
{
	public static void main(String args[])
	{
		D d1= new D(10,20);
		d1.disp();
	}
}
