import java.util.*;
import java.io.*;
class Demo
{
	public static void main(String[] args) {
		
		HashMap d = new HashMap();
		d.put("value 1",new Double(1.1));
		d.put("value 2",new Double(2.2));
		d.put("value 3",new Double(3.3));
		d.put("value 4",new Double(4.4));
		d.put("value 5",new Double(5.5));

		Set set = d.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.print("->"+me.getKey()+" ");
			System.out.println(me.getValue()+":");
		}
	}
}