class MyThread extends Thread
{
	private int a;
	MyThread(int a)
	{
		this.a = a;
	}
	public synchronized void count()
	{
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.print(a+" ");
			a++;
		}
	}
	public void run()
	{
		count();
	}
	public static void main(String args[]) throws Exception
	{	
		MyThread mt = new MyThread(1);
		MyThread mt1 = new MyThread(11);

		mt.start();
		mt.join();
		mt1.start();
	}
}