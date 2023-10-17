package validate_ATM_pin;

public class ValidationClass 
{
private int pin;

public void getter()
{
	System.out.println("XYZ Bank");
	if (validatePin(pin)) {
        System.out.println("Enter the amount....");
    } else {
        System.out.println("Invalid pin!!! Re-enter the pin.");
    }
}
public void setter(int pin)
{
	this.pin=pin;
	
	
}
public boolean validatePin(int pin_input) {
    int[] pin_list = { 1001, 1234, 1212 };

    if (pin_input >= 1000 && pin_input <= 9999) {
        for (int pin : pin_list) {
            if (pin == pin_input) {
                return true; // PIN is valid
            }
        }
    }

    return false; // PIN is invalid
}
}

/*
 * public int validatePin(int pin_input) { int []pin_list= {1001,1234,1212};
 * 
 * if(pin_input>=1000&&pin_input<=9999) {
 * 
 * for(int pin:pin_list) { if(pin==pin_input) {
 * System.out.println("Enter the amount...."); return pin_input;// Return the
 * validated pin } else {
 * System.out.println("Invalid pin!!! Re-enter the pin."); } } } else {
 * System.out.println("Enter a valid pin"); } return -1;// Return -1 to indicate
 * an invalid pin } }
 */