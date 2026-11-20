package learningJava;

public interface RBI {
	
	int UPILimit=100000;
	
	void Aadharcardmandadory();
	
	boolean pancardmandadory();
	
	default void homeloan()
	{
		System.out.println("homeloan");
	}
	static void bikeloan()
	{
		System.out.println("bikeloan");
	}

}
