class calculate
{
	int real, img; 
	calculate(int r, int i)
	{
			real = r;
			img = i;
	}
 
	void display()
	{
		System.out.println(real+"+"+img+"i");
	}
};
 
class complex
{
	public static void main(String args[])
	{
		calculate c1 = new calculate(2, 5);
		c1.display();
	}

};