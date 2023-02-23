import java.util.*;
class exception1
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
	try
		{
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.print("c="+c);
		}
	catch(Exception e)
		{
		System.out.println("error"+e);
		}
	System.out.println("end");
	}
}
