package javaClassWork8;

import java.util.Scanner;

public class NumberFormatException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a hex number: ");
  String hex = input.nextLine();			
  System.out.println("The decimal value for hex number "+ hex +" is " + hexToDecimal(hex.toUpperCase()));

	}

		
	public static int hexToDecimal(String hex)
	{		int decimalValue = 0;
		for(int i=0;i< hex.length();i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue*16 + hexCharToDecimal(hexChar);
		}
	
	return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		int flag=0;
		try{

			if(ch>='A'&&ch<='F')
			flag= 10+ch-'A';
		else if(ch>=0&&ch<=9)
			flag= ch-'0';
		else throw new NumberFormatException();
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException Error");
		}
		return flag;
	}

}
