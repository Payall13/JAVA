//

class c
{
	int c;
	c()
	{
		System.out.println("cons. without arg.");
	}
	c(int a)
	{
		System.out.println("cons. with arg");
		c = a;
	}
	c sum (c c2)
	{
		c c3 = new c();
		c3.c = this.c+c2.c;
		return(c3);
	}
	void disp()
	{
		System.out.println("c ="+c);
	}
}

class cons3
{
	public static void main(String args[])
	{
		c c1, c2, c3;
		c1 = new c(10);
		c2 = new c(20);
		c3 = new c();
		c1.disp();
		c2.disp();
		c3.disp();
	}
}

