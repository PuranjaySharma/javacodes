import java.util.Scanner;
import java.util.*;
class ArraySize
{
	Scanner sc = new Scanner(System.in);

	private int index = 0;
	private int arr[] ;
	private final int INIT_CAPACITY = 10;

	public ArraySize()
	{
		arr = new int[INIT_CAPACITY];
	}
	public void getLength()
	{
		System.out.println("Length of array is: "+arr.length);
	}
	public void add(int a)
	{
		if(index<arr.length)
		{
			arr[index++] = a;
		}
		else
		{
			//new array of new size
			int newSize = arr.length + (int)(1.5*arr.length);
			int newarr[] = new int[newSize];
			//copy data from arr to new arr
			for(int i = 0 ; i < arr.length ; i++)
			{
				
					newarr[i] = arr[i];
				
			}
			//passing reference to old array
			arr = newarr;
			arr[index++] = a;
		}
	}

}
class Demo
{
	public static void main(String[] args) {
		
		ArraySize d = new ArraySize();

		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		d.add(7);
		d.add(8);
		d.add(9);
		d.add(10);
		d.getLength();
		d.add(100);
		d.add(34);
		d.getLength();

	}
}