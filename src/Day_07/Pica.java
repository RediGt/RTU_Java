package Day_07;

public class Pica 
{
	public Pica(String name, String size, int count)
	{
		this.size = size;
		this.count = count;
		this.name = name;
		billForPica();
	}
	
	private String size;
	private int count;
	private String name;
	private double sizeQuatient = 1;
	
	private void billForPica()
	{
		double bill = 0;
		SetSizeQuatient();
		
		switch (name)
		{
			case "Margarita":
				bill = 7.5 * this.sizeQuatient * this.count;
				break;
			case "Sicily":
				bill = 8.5 * this.sizeQuatient * this.count;
				break;
			case "FourCheese":	
				bill = 6.5 * this.sizeQuatient * this.count;
				break;
			default:
				System.out.println("No such pica");
				break;
		}
		
		if (bill != 0)
			System.out.println("The order price for " + this.count + " of " + this.name + " is " + bill);
	}
	
	private void SetSizeQuatient()
	{
		if (this.size == "Big")
			this.sizeQuatient = 2;
		if (this.size == "Middle")
			this.sizeQuatient = 1.5;
	}
}
