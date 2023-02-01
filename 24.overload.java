class B
{
	int sum(int a,int b)
	{
		System.out.println("int sum");
		return(a+b);
	}
	float sum(float a,float b)
	{
		System.out.println("int sum");
		return(a+b);
	}
}
class overload2
{
	public static void main(String args[])
	{
		float x=100,y=200;
		B b1 = new B();
		System.out.println("sum of two int nos="+b1.sum(10,20));
		System.out.println("sum of two float nos="+b1.sum(x,y));
	}
}
		
