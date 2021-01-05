package javaClassWork7;

import java.util.ArrayList;
import java.util.Scanner;

public class elevenThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 integers: ");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int n = input.nextInt();
			list.add(n);
		}
		removeDuplicate(list);
		System.out.print("The distinct integers are ");
		for (Integer integer : list)
			System.out.print(integer + " ");
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		int n1 = 0;
		while (n1 < list.size()) {
			int n2 = list.get(n1);
			if (list.indexOf(n2) != n1)
				list.remove(n1);
			else
				n1++;
		}
	}

}
