package javaClassWork5;

import java.util.Random;

public class nineFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random(1000);
		System.out.println("From random 1:");
		for(int i = 0; i < 50; i++){
			System.out.print(random1.nextInt(100) + " ");
		}
		
		Random random2 = new Random(1000);
		System.out.println("\nFrom random 2:");
		for(int i = 0; i < 50; i++){
			System.out.print(random2.nextInt(100) + " ");
		}

	}

}
