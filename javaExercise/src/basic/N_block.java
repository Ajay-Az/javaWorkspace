package basic;

public class N_block {
	int a;
	{
		a=10;
		System.out.println(a);
		
	}
	{
		System.out.println(a);	
	}
public static void main(String args[])
{
	N_block a=new N_block();
	System.out.println("hello");
	N_block r=new N_block();	
}
}
