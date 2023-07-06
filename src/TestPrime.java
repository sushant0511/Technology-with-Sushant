import java.util.Scanner;

public class TestPrime {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int test=11;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				test=23;
				break;
			}
		}
		if(test==23)
		{
				System.out.println("Not Prime");
			}
			else
			{
				System.out.println("Prime");
			}
		
		
	}
}
