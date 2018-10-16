import java.io.*;
class Demo
{
	public static void main(String[] args) {
		File f=new File("C:/Users/Dell/Desktop/java/Acadview/File handling 1/abc.txt");
		try
		{
			
			FileOutputStream fout = new FileOutputStream(f);

			String s = "It is a path";
			char[] a=s.toCharArray();
			int i;
            for(i=0;i<s.length();i++)
            {
				fout.write(a[i]);
		    }

			fout.close();

			FileInputStream fin = new FileInputStream(f);

			i = fin.read();

			while(i!= -1)
			{
				System.out.print((char)i);
				i = fin.read();
			}

			fin.close();

			System.out.println();
			System.out.println("Path of file: "+f.getPath());
		}
		catch(IOException e)
		{
           System.out.println(e);
		}

	}
}