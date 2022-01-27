package javaExerciseBasics;

public class FactorialUsingWhile 
{
	public static void main(String[] args) 
	{
		int n=1, fact=1;
		while(n<=10)
		{
			fact =fact*n;
			System.out.println(fact);
			n++;
		}
	}
}
