class breakcontrol
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=10;i++)
		{
			for(j=i+1;j<=10;j++)
			{
				if((i+j)%4==0)
				break;
				if((i*j)%4==0)
					continue;
				System.out.println("i="+i+"\t+j="+j);
			}
		}
	}
}
