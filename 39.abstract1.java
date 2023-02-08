abstract class shape
{
	abstract void draw();
}
class Line extends shape
{
	void draw()
	{
		System.out.println("Line");
	}
}
class Rectangle extends shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}
class abstract1
{
	public static void main(String args[])
	{
		Line l1=new Line();
		Rectangle r1= new Rectangle();
		l1.draw();
		r1.draw();
	}
}
