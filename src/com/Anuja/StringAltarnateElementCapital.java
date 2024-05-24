package com.Anuja;

public class StringAltarnateElementCapital {
	public static void main(String[] args) {
		String s= "testing shashtra is for testers";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(i%2==0) {
				System.out.print(Character.toLowerCase(c));
			}else {
				System.out.print(Character.toUpperCase(c));
			}
		}
	}
}
