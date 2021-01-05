package javaClassWork3;

import java.util.Arrays;
import java.util.Scanner;
public class paiXu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String test = input.next();
        System.out.println(sort(test));
    }
    public static String sort(String s)
    {
        int len = s.length();
        char[] ass = new char[len];
        for(int i=0;i<len;i++)
            ass[i]=s.charAt(i);
        Arrays.sort(ass);
        String dick = "";
        for(int i=0;i<len;i++)
            dick+=ass[i];
        return dick;
	}

}
