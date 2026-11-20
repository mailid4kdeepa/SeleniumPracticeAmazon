package abstractWithDifferentImplementation;

public class Main {
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.sound();
		//or 
		Animal a1=new Dog();
		a1.sound();
		
		Animal a2=new Cat();
		a2.sound();
		
		
	}

}
