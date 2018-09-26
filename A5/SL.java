import java.util.Scanner;
class array
{
int[ ] arr=new int[10];
public void check()
{
System.out.println("Enter the  array elements:");
Scanner S=new Scanner(System.in);
for(int i=0;i<10;i++)
{
  arr[i]=S.nextInt();
}
int max=arr[0];
int Second_max=arr[0];
for(int i=0;i<10;i++)
{
  if(arr[i]>max)
{
Second_max=max;
max=arr[i];
}
else if(arr[i]>Second_max)
{
Second_max=arr[i];
}
}
System.out.println("Second largest array element is "+Second_max);
}
}
class SL
{
public static void main(String[ ] args)
{
array c=new array();
c.check();
}
}