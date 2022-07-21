// Write a program to check if a given string is a Palindrome.
//A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.
package com.globallogic.July20;

public class Mypalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MOm";
		String rev = "";
		 
        
        
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        
        if (str.equals(rev)) {
            System.out.println("got palindrome string");
        }
        else{
        	System.out.println("Not palindrome");
        }
      
    }

	}


