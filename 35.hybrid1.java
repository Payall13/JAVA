class A
{
	void dispA()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void dispB()
	{
		System.out.println("class B");
	}
}
class C extends B
{
	void dispC()
	{
		System.out.println("class C");
	}
}
class D extends B
{
	void dispD()
	{
		System.out.println("class D");
	}
}
class hybrid1
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.dispA();
		c1.dispB();
		c1.dispC();
		
		D d1=new D();
		d1.dispA();
		d1.dispB();
		//d1.dispC();
		d1.dispD();
	}
}
