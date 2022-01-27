package basic;

public class N_Block1 
{
	int a=10;
	{
		int a=20;
		System.out.println(a);
	}

	{
		int a=30;
		
		System.out.println(this.a);
		System.out.println(a);
		
	}
	public static void main(String[] args) 
	{
		
N_Block1 a=new N_Block1();
	}

}
