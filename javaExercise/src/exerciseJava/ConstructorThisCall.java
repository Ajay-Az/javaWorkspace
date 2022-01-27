package exerciseJava;
class A
{
	A(int a)
	{this();
		System.out.println("Hello");
	}
	A()
	{
		System.out.println("Bye");
	}
}

public class ConstructorThisCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A(20);

	}

}
