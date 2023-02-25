class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class customexception
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("error found");
		}
		catch(MyException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
