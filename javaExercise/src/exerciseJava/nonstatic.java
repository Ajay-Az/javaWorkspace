package exerciseJava;

public class nonstatic 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
	}

}

class Demo
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
}