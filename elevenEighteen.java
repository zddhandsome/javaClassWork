package javaClassWork7;

import java.util.ArrayList;

public class elevenEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list = toCharacterArray("abc");
		for(int i : list)
			System.out.println((char)i);
	}
	public static ArrayList<Character> toCharacterArray(String s){
	    ArrayList<Character> list = new ArrayList<>();
	    for(int i=0;i<s.length();i++)
	        list.add(s.charAt(i));
	    return list;
	}

}
