import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter your Numbers");
		try
		{
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		c=a/b;
		System.out.println(c);
		}
		catch (Exception e) {
			System.out.println("Please do proper input");
		}
		
		finally {
			System.out.println("Always exceuted");
		}
	}

}
