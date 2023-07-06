import java.util.Scanner;

public class SOD {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int sum=0;
		int rem;
		while(num>0)
		{
		rem=num%10;
		sum=sum*10+rem;
		System.out.println("rev="+sum);
		num=num/10;
		
		}
		
		

	}

}
