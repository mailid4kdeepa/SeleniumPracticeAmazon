package encapsulation;

public class Bank {
	private double balance;	
	
	public Bank(double bal)
	{
		if(bal>0)
		{
			balance=bal;
		}
		else
		{
			balance=0;
		}
	}
	public double getBalance()
	{
		return balance;
	}


public void deposit(double amount)
{
	if(amount>0)
	{
		balance+=amount;
	}
}
public void withdraw(double amount)
{
	if(amount<=balance)
	{
		balance-=amount;
	}
		else
		{
		System.out.println("Insufficient balance");
		}
	
}
	
}

