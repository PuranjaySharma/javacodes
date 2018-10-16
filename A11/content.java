import java.io.*;
class Demo
{
	public static void main(String[] args) {
		
		try
		{
			File file1 = new File("C:/Users/Dell/Desktop/java/Acadview/File handling 2/abc.txt");
			File file2 = new File("C:/Users/Dell/Desktop/java/Acadview/File handling 2/xyz.txt");

			FileInputStream fin = new FileInputStream(file1);
			FileOutputStream fout = new FileOutputStream(file2);

			int i;
			i = fin.read();

			while(i != -1)
			{
				fout.write((char)i);
				i = fin.read();
			}

			fin.close();
			fout.close();

			FileInputStream in = new FileInputStream(file2);

			i = in.read();
			while(i != -1)
			{
				System.out.print((char)i);
				i = in.read();
			}

			in.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}