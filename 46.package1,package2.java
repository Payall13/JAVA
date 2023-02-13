package p1;
public class package1
{
	public void disp()
	{
		System.out.println("package1");
	}
}
// package1
import p1.package1;
class package2
{
	public static void main(String args[])
	{
		package1 p2=new package1();
		p2.disp();
	}
}
