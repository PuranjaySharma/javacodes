class Test {
    static int i;
    int j;
    static {
   
        System.out.println(" 1st Static Block ");
    }
	static{
		System.out.println("2nd Static Block");
	}
    Test(){
        System.out.println("Constructor");
    }
}
 
class Stat
 {
    public static void main(String args[]) {
 

       Test t1 = new Test();
    }
}