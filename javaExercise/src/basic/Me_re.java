package basic;

import java.util.Scanner;
public class Me_re {
	public static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	

	public static void main(String[] args) {
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a no:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int res=sum(a,b);
			System.out.println("sum is "+res);
		}

	}

}
	

