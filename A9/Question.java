import java.util.Scanner;
class Question
{
  public static void main (String[] args)
  {


    Scanner s=new Scanner(System.in);
System.out.println("Enter main string");	
    String x=s.nextLine();

System.out.println("Enter string to be found");
    String f=s.nextLine();
int c=-1;    
c=x.lastIndexOf(f);
if(c>=0)
    {  
    System.out.println("Yes this substring occurs in main string");
    }
else
{
    System.out.println("No this substring doesn't occurs in main string");

}
}
}