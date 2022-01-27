package exerciseJava;
 class C{

	C(int a)
	{
		System.out.println("Ist Constructor");
	}

	C(int a,int b)
	{
		System.out.println("2nd Constructor");
	}
}
class B extends C
{	
	B(int a)
	{	super(20);
	System.out.println("3rd Constructor");
	}

	B(int a,int b)
	
	{super(20,30);
	System.out.println("4th Constructor");
	}
}


public class Example1
{
public static void main(String[] args) 
{
	B b1=new B(20);
}
}

