package encapsulation;

public class MobileNumber {
	
	private String mobileNo;
	
	public void setMobileNo(String mobileNo)
	{
		if(mobileNo.matches("[0-9]{10}" ))
		{
			this.mobileNo=mobileNo;
		}
		else
		{
			System.out.println("Invalid mobile number");
		}
	}
	
	public String getMobileNo()
	{
		return mobileNo;
	}
	

}
