class overloading
{ 
    public void fun()
    {
        System.out.println("NULL ARGUMENTS");
    }
    public void fun(int a)
    {
        System.out.println("Integer :"+" "+a);
    }
    public void fun(float a)
    {
        System.out.println("Float :"+" "+a);
    }
 }
public class overload{
    public static void main(String [] args)
    {
        overloading s= new overloading();
        s.fun();
        s.fun(67);
        s.fun(2.76f);
    }
}