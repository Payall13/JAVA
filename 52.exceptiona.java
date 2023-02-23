class exceptiona
{
	public static void main(String args[])
	{
		int[]a=new int[5];
		for(int i=0;i<5;i++)
			a[i]=(i+1)*10;  
	try
	{
		for(int i=0;i<6;i++)
			System.out.println(a[i]);
	}
	catch (Exception e)
	{
		System.out.println("Error="+e);
	}
	System.out.println("end");
	}
}
		



