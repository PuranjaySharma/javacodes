interface Animals
{
	void speak();
	void eat();
}

class Cat implements Animals
{
	public void speak()
	{
		System.out.println("I am a CAT");
	}

	public void eat()
	{
		
		System.out.println("cat eating food ");
	}
}


class Dog implements Animals
{
	public void speak()
	{
		System.out.println("I am a DOG");
	}
	public void eat()
	{
		System.out.println(" dog eating food ");
	}
}
public class Interface
{
	public static void main(String args[])
	{

		Dog d = new Dog();
		Cat c = new Cat();
		
		c.speak();
		c.eat();
		
		d.speak();
		d.eat();
	}
}