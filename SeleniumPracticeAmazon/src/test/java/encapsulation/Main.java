package encapsulation;

public class Main {

	public static void main(String[] args) {
		Bank b=new Bank(500);
		b.deposit(7000);
		
		b.withdraw(5000);
		System.out.println(b.getBalance());
	}
}
