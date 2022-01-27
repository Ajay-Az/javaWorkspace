package basic;

public class Fact_w {

	public static void main(String[] args) 
	{
		int n=1;
		int fact=1;
		while(n<=10)
		{
			fact=fact*n;
			System.out.println("the factorial of "+n+" is "+fact);

			n++;
		}
		
		//System.out.println("the factorial of "+n+" is "+fact);

	}

}
