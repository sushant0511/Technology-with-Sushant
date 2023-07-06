
class FirstThre extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Hi from show");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
}
class SecondThre extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Hi from show Second");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
}

public class TestSleep {

	public static void main(String[] args) {
		FirstThre thre=new FirstThre();
		thre.start();
		try {
			thre.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SecondThre thre2=new SecondThre();
		thre2.start();

	}

}
