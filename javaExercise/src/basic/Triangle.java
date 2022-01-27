package basic;

public class Triangle {

	public static void main(String[] args) {
		
		new tri().area();
	}

}

class tri
{
int b=45;
int h=79;

void area()
{
	double res=0.5*b*h;
	System.out.println(res);
}
}