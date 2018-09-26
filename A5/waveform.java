import java.util.Scanner;
class array
{
int[ ] arr=new int[10];
public void check()
{
int i,temp;
System.out.print("Enter  the array elements :");
Scanner s=new Scanner(System.in);
for(i=0;i<10;i++)
{
  arr[i]=s.nextInt();
}
for(i=0;i<10;i+=2)
   {
     temp=arr[i];
     arr[i]=arr[i+1];
     arr[i+1]=temp; 
   } 
 for (i=0; i<10; i++)
      System.out.print(arr[i]+" ");
}
}
class waveform
{
public static void main(String[ ] args)
{
array a=new array();
a.check();
}
}
