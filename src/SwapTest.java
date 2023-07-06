
public class SwapTest {

	public static void main(String[] args) {

		int a=10,b=20,temp;
		System.out.println(a+"  "+b);
		temp=a;
		a=b; // override value of b
		b=temp;
		System.out.println(a+"  "+b);

	}

}
