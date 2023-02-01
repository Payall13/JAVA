import java.util.*;
class while1
{
	public static void main(String args[])
	{
		int n,r,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println("s="+s);
	}
}
