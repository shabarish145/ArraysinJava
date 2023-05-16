package constructors;

public class Overloading
{
	public Overloading(int a ,int b)
	{
		int c =a+b;
		System.out.println("print value of c: " +  c);
	}
	
	public Overloading(int a, int b, int c)
	{
		int d =a+b+c;
		System.out.println("print value of d: " + d);
	}
	
	public void display()
	{
		System.out.println("Constructor loading is working");
	}

	public static void main(String[] args)
	{
		Overloading obj = new Overloading(10,20);
		obj.display();
		Overloading obj2 = new Overloading(10,20,30);
		obj2.display();
		
		
		
				
		

	}

}
