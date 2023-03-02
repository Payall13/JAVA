class testouter1
{
	static int data=30;
	static class Inner
	{
		void msg()
		{
			System.out.println("data is "+data);
		}
	}
	public static void main(String args[])
	{
		testouter1.Inner obj=new testouter1.Inner();
		obj.msg();
	}
}
