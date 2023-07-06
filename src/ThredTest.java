class FirstThread extends Thread
{
	public void run()
	{
		System.out.println("Run Test");
	}
}
class TesRunable implements Runnable
{

	@Override
	public void run() {
		System.out.println("From runnable");
		
	}
	
}

public class ThredTest {

	public static void main(String[] args) {
		
		TesRunable run=new TesRunable();
		Thread thread=new Thread(run);
		thread.start();
		
//		FirstThread thread=new FirstThread();
//		thread.start();
		

	}

}
