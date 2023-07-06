import java.util.Scanner;

public class SotingTest {

	public static void main(String[] args) {

		int a[]=new int[10];
		int temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
		}
		for(int j=0;j<4;j++)
		{
		for(int i=0;i<4;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
