import java.io.*;
class Demo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int length , d , y , m;
		String day , month , year;
		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String monthName[] = {"","January","February","March","April","May","June","July","August","September","October","November","December"};

		System.out.println("Enter date:");
		String str = bf.readLine();
		length = str.length();

		if(length == 8)
		{
			day = str.substring(0,2);
			month = str.substring(2,4);
			year = str.substring(4);
			d = Integer.parseInt(day);
			m = Integer.parseInt(month);
			y = Integer.parseInt(year);

			if((y%400 == 0) || ((y%100 != 0)&&(y%4 == 0)))
			{
				days[2] = 29;
			}

			if(m<0 || m>12 || d<0 || d>days[m] || y<0 || y>9999)
			{
				System.out.println("Day, month or year outside acceptable limit");
			}

			else
			{
				System.out.println("Date: "+day+"-"+monthName[m]+"-"+year);
			}
		}
		else
		{
			System.out.println("Input entered is incorrect");
		}
	}

}