import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter string");
String x=s.nextLine();
int c=1;
for(int i=0;i<x.length();i++)
{
if(x.charAt(i)==' ')
{
c++;
}
}
System.out.println("Word count "+c);

}

}