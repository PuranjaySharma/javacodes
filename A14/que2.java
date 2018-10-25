class que2
{
	public static <T extends Comparable<T>> void sort(T[] arr)
	{
		for(int i=0; i < (arr.length-1) ; i++)
		{
			int min = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[min].compareTo(arr[j]) > 0)
				{
					min = j;
				}
			}
			T temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static <T> void print(T arr[])
		{
			for(int i = 0 ; i < arr.length ; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	
	public static void main(String[] args) {
		
		Integer[] arr = {10,4,23,1,7};
		System.out.println("Array before sorting :");
		print(arr);
		sort(arr);
		System.out.println("Array after sorting :");
		print(arr);

		Float[] arr2 = {12.98f,21.5f,7.4f,1.2f};
		System.out.println("Array before sorting :");
		print(arr2);
		sort(arr2);
		System.out.println("Array after sorting :");
		print(arr2);
	}
}