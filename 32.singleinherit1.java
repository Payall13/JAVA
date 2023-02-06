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
class singleinherit1
{
	public static void main(String args[])
	{
		A a1;
		B b1;
		
		a1=new 	A();
		a1.dispA();
		//a1.dispB();
		
		a1=new B();
		a1.dispA();
		//a1.dispB();
		
		/*b1=new A();
		b1.dispA();
		b1.dispB();*/
		
		b1=new B();
		b1.dispA();
		b1.dispB();
	}
}
