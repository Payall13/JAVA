class A
{
	void disp()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("class B");
	}
}
final class C extends B
{
	void disp()
	{
		System.out.println("class C");
	}
}
/*class D extends C
{
	void disp()
	{
		System.out.println("class C");
	}
	
}*/
class final1
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.disp();
		C c1=new C();
		c1.disp();
	}
}
