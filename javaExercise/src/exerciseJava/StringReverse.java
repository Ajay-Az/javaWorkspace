package exerciseJava;

public class StringReverse
{

	public static void main(String[] args) 
	{
		String S="JAVA";
		for(int i=S.length()-1;i>=0;i--)
		{
			System.out.print(S.charAt(i));
		}
	}

}
