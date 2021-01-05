package javaClassWork2;

import java.util.Scanner;
public class chouPai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = (int)(Math.random()*13);
int dick = (int)(Math.random()*4);
String[]nums = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
String[]dicks = {"Clubs","Diamonds","Hearts","Spades"};
System.out.println("Äã³éµÄ¿¨ÅÆÎª"+nums[num]+"µÄ"+dicks[dick]);
	}
}
