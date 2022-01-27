package basic;

public class JVM_M {
	int a=10;
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
			JVM_M ad=new JVM_M();
			ad.add();
			System.out.println(ad.a);
			
	}

}
