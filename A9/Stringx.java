import java.util.Scanner;
class Stringx
{
public static void main(String[] args)
{
String x;
Scanner s=new Scanner(System.in);
System.out.println("Enter String");
x=s.nextLine();
int l=x.length();
for(int i=0;i<l;i++)
{

System.out.println("Substring ("+i+") "+x.substring(i));

}
}


}