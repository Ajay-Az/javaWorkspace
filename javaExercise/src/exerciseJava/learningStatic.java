package exerciseJava;

public class learningStatic
{
	public static void main(String[] args)
	{
		Sample.Demo();
		System.out.print(Sample.x);

	}
}
class Sample
{	
	static char x='5';
	public static void Demo()
	{
		System.out.println("hi");
	}
}