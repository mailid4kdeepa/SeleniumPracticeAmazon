package learningJava;

public class CarDetails {
	public static void main(String[] args) {
		Car c=new Car();
		
		String cb=c.carbrand();
		System.out.println(cb);
		
		int cp=c.carprice();
		System.out.println(cp);
		
		c.cardetails();
		
		String cc=c.carcolor();
		System.out.println(cc);
		
	
	}

}
