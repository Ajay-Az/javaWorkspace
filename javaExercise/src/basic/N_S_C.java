package basic;

public class N_S_C 
{
	N_S_C()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("non-static block");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
		N_S_C a=new N_S_C();

	}

}
