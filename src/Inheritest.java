
class Car
{
	public void fourTyre()
	{
		System.out.println("I have four Tyre");
	}
}

class Venue extends Car
{
	public void powerWindows()
	{
		System.out.println("I have Power Windows");
	}
}
class Audi extends Venue
{
	public void airBags()
	{
		System.out.println("I have airbags");
	}
}

public class Inheritest {

	public static void main(String[] args) {

		
		
		Audi audi=new Audi();
		audi.fourTyre();
		audi.powerWindows();
		audi.airBags();
	}

}
