class Print
{
	public <T> void display(T arr[])
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class Demo
{
	public static void main(String[] args) {
		
		String str[] = {"H","E","L","L","O"};
		Integer in[] = {10,20,30,40,50};
		Print p = new Print();
		p.display(str);
		System.out.println();
		p.display(in);
	}
}