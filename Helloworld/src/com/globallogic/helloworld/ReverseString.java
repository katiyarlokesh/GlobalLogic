package com.globallogic.helloworld;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s = "Man";    
	        //Stores the reverse of given string    
	        String reverseds = "";    
	            
	            
	        for(int i = s.length()-1; i >= 0; i--){    
	            reverseds = reverseds + s.charAt(i);    
	        }  
	          
	        System.out.println( reverseds);    
	    }   
}

	
