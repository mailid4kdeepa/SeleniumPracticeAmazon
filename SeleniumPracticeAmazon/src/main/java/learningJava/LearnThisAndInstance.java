package learningJava;

public class LearnThisAndInstance {
	int a;
	
	
	String name()
	{
	return "Deepa";
	}
		
	void addtwonumbers(int b,int c)
	{
		System.out.println(this.a+b+c);
		System.out.println(a);
	}
	
	void name(String name)
	{
		this.name();
		System.out.println(this.name());	
		}
	

public static void main(String[] args) {
	LearnThisAndInstance tc=new LearnThisAndInstance(); 
	tc.addtwonumbers(20, 3);
	tc.name("Deepa");
	
	
}	
}

