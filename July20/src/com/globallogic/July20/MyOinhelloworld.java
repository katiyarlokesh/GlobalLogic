package com.globallogic.July20;

public class MyOinhelloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				System.out.println("got o from begining" + " " + i);
				break;
			}
		}
		for (int i = str.length()-1; i > 0; i--) {
			if (str.charAt(i) == 'o') {
				System.out.println("got o from end" + " " + i);
				break;
			}
		}

	}

}
