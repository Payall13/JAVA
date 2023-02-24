import java.util.*;
class exception4
{
	static void func1()
	{
		System.out.println("fun1");
		try
		{
			func2();
		}
		catch(Exception e)
		{
			System.out.println("catch fun1");
		}
	}
	static void func2()
	{
		System.out.println("fun2");
		try
		{
			func3();
		}
		catch(NumberFormatException e)
		{
			System.out.println("catch fun2");
		}
	}
	
	static void func3()
	{
		System.out.println("fun3");
		try
		{
			func4();
		}
		catch(NumberFormatException e)
		{
			System.out.println("catch fun3");
		}
	}
	static void func4()
	{
		System.out.println("fun4");
		try
		{
			Scanner sc=new Scanner (System.in);
			int a,b,c;
			System.out.println("enter two nos");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("c="+c);
		}
		catch (Exception e)
		{
			System.out.println("catch fun 4");
			throw e;
		}
	}
	public static void main(String args[])
	{
		func1();
	}
}
		
		
