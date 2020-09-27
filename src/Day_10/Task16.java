package Day_10;

public class Task16 
{
	public static void Task()
	{		
		Bycicle bycicle1 = new Bycicle("Nike", "Blue", 2);
		Car car1 = new Car("BMW", "X5", 4);
		
		System.out.println(car1.Model + " " + car1.GetWeels());
		bycicle1.SetWeels(3);
		System.out.print(bycicle1.Model + " on " + bycicle1.GetWeels() + " wheels ");
		bycicle1.Drive();
	}
}

class Vehicle
{   
	public String Model;
	public String Color;
	
	public void Drive()
    {
        System.out.println("Brum, Brum...");
    }	
}

class Bycicle extends Vehicle
{
    private int Wheels;
    
    public Bycicle(String mdl, String clr, int wls)
    {
        Model = mdl;
        Color = clr;
        Wheels = wls;
    }
    
    public void Drive()
    {
    	System.out.println("Bycicle has no engine");
    }
    
    public int GetWeels()
    {
    	return Wheels;
    }
    
    public void SetWeels(int wls)
    {
    	Wheels = wls;
    }
}

class Car extends Vehicle
{
    private int Wheels;
    
    public Car(String mdl, String clr, int wls)
    {
        Model = mdl;
        Color = clr;
        Wheels = wls;
    }

    public int GetWeels()
    {
    	return Wheels;
    }
    
    public void SetWeels(int wls)
    {
    	Wheels = wls;
    }
}
    