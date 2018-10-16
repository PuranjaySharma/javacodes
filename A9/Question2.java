import java.util.Scanner;
class Question2
{
public static void main(String[] args)
{
String x,n="";
Scanner s=new Scanner(System.in);
System.out.println("Enter String");
x=s.nextLine();
System.out.println("Original string "+x);
n = x.replaceAll("[aeiouAEIOU]", "");
System.out.println("String without vowel "+n);

}


}