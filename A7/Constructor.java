class Demo
{
	Demo()
	{
		System.out.println("// Default Constructor called.");
	}
	
	Demo(int a)
	{
		this();							
		System.out.println("// Parameterized Constructor called.");
	}
}
public class Constructor
{
	public static void main(String args[])
	{
		Demo obj = new Demo(10);		
		}
}