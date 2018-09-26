class tatic{
   static int num;
   static String str;
   static{
      System.out.println("First static");
      num = 287;
     str = "first";
  } 
  static{
      System.out.println("Second static");
      num = 288;
     str = "Second";
  }
  public static void main(String args[])
  {
      System.out.println(num);
      System.out.println(str);
   }
}