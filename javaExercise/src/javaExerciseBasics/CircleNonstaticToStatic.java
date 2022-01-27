package javaExerciseBasics;
import java.util.Scanner;
public class CircleNonstaticToStatic 
{
	public static void main(String[] args) 
	{
		new Demo().circle_Area();
	}

}

class Demo
{
	void circle_Area()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Radius.");
		int r=Sc.nextInt();
		
		final double pi=3.14;
		double res=pi*r*r;
		System.out.println(res);
	}
}