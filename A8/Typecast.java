import java.util.Scanner;

class numbers
{
	private String a, b;
	private int n1,n2;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First value : ");
		a = sc.nextLine();
		System.out.print("Enter the Second value : ");
		b = sc.nextLine();
		
		n1 = Integer.parseInt(a);
		n2 = Integer.parseInt(b);
	}

	int max()
	{
		if(n1 > n2)
			return n1;
		
		else 
			return n2;
		}
	
	
}

public class Typecast
{
	public static void main(String args[] )
	{
		numbers obj = new numbers();
		obj.input();
		System.out.println("Max : " + obj.max());
	}

}