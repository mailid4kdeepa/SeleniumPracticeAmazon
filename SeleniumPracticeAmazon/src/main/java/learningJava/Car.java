package learningJava;

public class Car {
	String brand="Honda";
	int price=280000;
	String color="blue";
	
	public String carbrand()
	{
		System.out.println("The car brand is "+brand);
		return brand;
	}
	public int carprice()
	{
		System.out.println("The car price is"+price);
		return price;
	}
	public String carcolor()
	{
		System.out.println("The color of car is"+color);
		return color;
	}
	
	public void cardetails()
	{
		System.out.println("Car Details");
	}
	
	public String carvalues()
	{
		System.out.println("carvalues");
		return "carreport";
	}
	

}
