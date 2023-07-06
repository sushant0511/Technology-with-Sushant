import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		int a[]=new int[10];
		int sum=0;		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("Output");
		for(int i=0;i<5;i++)
		{
		sum=sum+a[i];
		
		}
		
		System.out.println("Sum="+sum);
		
		
		
//		a=scanner.nextInt();
//		b=scanner.nextInt();
//		c=scanner.nextInt();
//		d=scanner.nextInt();
//		e=scanner.nextInt();
//		f=scanner.nextInt();
//		System.out.println(a+b+c+d+e+f);

	}

}
