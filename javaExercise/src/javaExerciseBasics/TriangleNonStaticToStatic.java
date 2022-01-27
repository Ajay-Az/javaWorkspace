package javaExerciseBasics;

public class TriangleNonStaticToStatic 
{
	public static void main(String[] args) 
	{
		new Sample().traingle_Area();
	}

}

class Sample
{
	void traingle_Area()
	{
		int b=10;
		int h=20;
		double res=1.0/2.0*b*h;
		System.out.println(res);
	}
}
