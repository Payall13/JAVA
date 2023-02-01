class B
{
	int sum(int a,int b)
	{
		return(a+b);
	}
	int sum (int a,int b, int c)
	{
		return(a+b+c);
	}
}
class overload1
{
	public static void main(String args[])
	{
		B b1=new B();
		System.out.println("sum of two nos="+ b1.sum(10,20));
		System.out.println("sum of three nos="+b1.sum(10,20,30));
	}
}
