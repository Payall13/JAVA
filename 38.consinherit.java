/* super*/
class A
{
	A(int a)
	{
		System.out.println("class a");
		System.out.println("a="+a);
	}
}

class B extends A
{
	B()
	{
				super(10);

		System.out.println("class b");
	}
}

class consinherit
{
	public static void main(String args[])
	{
		B b1=new B();
	}
}
/*class a
a=10
class b*/
