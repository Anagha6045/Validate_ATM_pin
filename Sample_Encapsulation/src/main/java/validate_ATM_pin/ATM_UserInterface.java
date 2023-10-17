package validate_ATM_pin;

import java.util.Scanner;

public class ATM_UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj_sc=new Scanner(System.in);
		System.out.print("Enter pin : ");
		int pin=obj_sc.nextInt();
		obj_sc.close();
		
		ValidationClass obj=new ValidationClass();
		obj.setter(pin);
		obj.getter();
	}

}
