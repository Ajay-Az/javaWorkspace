package constructor;

public class bike 
{	
	String name;
	String brand;
	int cc;
	bike(String name,String brand,int cc)
	{
		this.name=name;
		this.brand=brand;
		this.cc=cc;
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.cc);
	}
	public static void main(String[] args) 
	{
		bike b=new bike("duke","ktm",390);
		bike b1=new bike("pulsar 200","bajaj",200);
	}

}
