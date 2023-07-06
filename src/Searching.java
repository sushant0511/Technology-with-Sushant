import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {


		int a[]=new int[10];
		int temp;
		int flag=0;
		int pos=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("Enter item to search");
		int item=scanner.nextInt();
		for(int i=0;i<5;i++)
		{
			if(a[i]==item)
			{
				flag=1;
				pos=i;
				break;
			}
		}
		if(flag==1)
		{
				System.out.println("found at pos "+(pos+1));
			}
			else
			{
				System.out.println("Not Found");
			}
		
		
	}

}
