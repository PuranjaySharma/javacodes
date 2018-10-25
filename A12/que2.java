import java.io.*;
class cvsFile
{
	public static void main(String[] args) {
		
		File first = new File("C:/Users/Dell/Desktop/java/Assignments/collection 1/first.txt");
        File second = new File("C:/Users/Dell/Desktop/java/Assignments/collection 1/second.txt");
        char a[] = new char[100];
        
        int index = 0;
        try{
        	FileInputStream fin = new FileInputStream(first);
        	
        	
        	int counter ;
        	counter = fin.read();
        	while(counter != -1)
        	{
        		a[index++] = (char)counter;
        		counter = fin.read();
        	}
        	fin.close();
        }
        catch(IOException e)
        {
        	System.out.println(e);
        }
        try
        {
        	FileOutputStream fout = new FileOutputStream(second);
        	for(int counter = 0 ; counter < index ; counter++)
        	{
        		fout.write(a[counter]);
        	}
        }
        catch(IOException e)
        {
        	System.out.println(e);
        }
        try
        {
        	FileInputStream in = new FileInputStream(second);
        	int counter2;
        	counter2 = in.read();
        	while(counter2 != -1)
        	{
        		
        		System.out.print((char)counter2);
        		counter2 = in.read();
        	}
        }
        catch(IOException e)
        {
        	System.out.println(e);
        }

	}
}