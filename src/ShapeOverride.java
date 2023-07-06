class Mobile
{
	public void feature(float cost) {
		System.out.println("Cost is "+cost);
	}
}
class SmartPhone extends Mobile
{
	public void feature(float cost) {
		System.out.println("Cost of Override is "+cost);
	}
}


public class ShapeOverride {

	public static void main(String[] args) {
	SmartPhone smartPhone=new SmartPhone();
	smartPhone.feature(20000);

	}

}
