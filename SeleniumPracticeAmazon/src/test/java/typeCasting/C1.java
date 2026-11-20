package typeCasting;

public class C1 {
	
	
	
		public static void main(String[] args) {
		//A a1=new B();
			A a1=new B1();
			//B1 b1=(B1) new A();
			a1.eat();
			
			B1 b=(B1) a1;
			b.bark();
			
		}
	}





