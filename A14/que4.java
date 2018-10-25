import java.util.*;
class Student
{
	int age;
	String name;
	Student(int age, String name)
	{
		
		this.age = age;
		this.name = name;
	}
	public String toString()
	{
		return this.age+" "+this.name+" ";
	}
}

class AgeSort implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.age-b.age;
	}
}

class NameSort implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return (a.name).compareTo(b.name);
	}
}

class Demo
{
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(12,"hey"));
		al.add(new Student(21,"rey"));
		al.add(new Student(3,"sia"));

		System.out.println("Before sorting : ");
		for(int i = 0; i < al.size() ; i++)
			System.out.println(al.get(i));

		Collections.sort(al, new AgeSort());

		System.out.println("Sorted according to age: ");
		for(int i = 0; i < al.size() ; i++)
			System.out.println(al.get(i));

		Collections.sort(al, new NameSort());

		System.out.println("Sorted according by name: ");
		for(int i = 0 ; i < al.size(); i++)
			System.out.println(al.get(i));
	}
}