import java.util.*;

public class Reverse
{
   public static void main(String args[])
   {
      String orig, rev="";
      int i, len;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a String to Reverse : ");
      orig = s.nextLine();
      
      len = orig.length();
	  
      for(i=len-1; i>=0; i--)
      {
          rev = rev + orig.charAt(i);
      }
	  
        System.out.print("Reverse of Entered String is : " +rev);
   }
}