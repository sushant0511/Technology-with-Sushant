import java.util.Scanner;

public class TestEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();// 6
		if(num==0) // 0
		{
			System.out.println("No is Zero");
		}
		else if(num%2==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}

	}

}
