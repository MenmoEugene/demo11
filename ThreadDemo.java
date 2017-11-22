
*/
class Demo extends Thread
{
	public void run()
	{
		for(int x = 0;x<50;x++)
			System.out.println("run===="+x);
	}
}



class  ThreadDemo
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Demo d = new Demo();
		d.start();

		for(int x =0;x<60;x++)
			System.out.println("Hello World!-----"+x);
	}
}
