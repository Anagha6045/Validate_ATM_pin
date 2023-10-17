package validate_ATM_pin2;

import java.util.Scanner;


public class UserInpuPin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner obj_sc=new Scanner(System.in);
		System.out.print("Enter pin : ");
		int pin=obj_sc.nextInt();
		obj_sc.close();
		
		ValidatePin obj=new ValidatePin();
		obj.setter(pin);
		obj.getter();

	}

}
