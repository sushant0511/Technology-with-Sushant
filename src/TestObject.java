public class TestObject {

	public static void main(String[] args) {
		Test obj=new Test();
	
		System.out.println("hi from Main Class");
		obj.sub();
		Test1 test1=new Test1();
		test1.add();
	}
}
class Test
{
	public void sub()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println("Sub="+c);
				
	}
}
class Test1
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("add="+c);
				
	}
}