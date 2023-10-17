package validate_ATM_pin2;

public class ValidatePin {
	private int  pin;
	public void getter()
	{
		validate_pin(pin);
	}
	public void setter(int pin)
	{
		
		this.pin= pin;
		
		
	}
	public void validate_pin(int pin_user)
	{
		if(pin_user==1234||pin_user==1212||pin_user==1001)
		{
			System.out.println("Enter amount");
		}
		else
		{
			System.out.println("Wrong pin");
		}
	}
	

}
