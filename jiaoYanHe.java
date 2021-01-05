package javaClassWork2;

import java.util.Scanner;

public class jiaoYanHe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int sum = 0,num =1;
System.out.println("Enter the first 9 digits of an ISBN as integer:");
String ISBN = scanner.nextLine();
for(int i=0;i<9;i++) {
	int j = ISBN.charAt(i)-'0';
	sum+=j*num++;
}
System.out.println("The ISBN-10 number is "+(((sum%11)==10)?(ISBN+"X"):(ISBN+(sum%11))));

}
}