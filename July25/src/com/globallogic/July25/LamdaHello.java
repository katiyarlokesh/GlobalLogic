package com.globallogic.July25;

interface Hello {
	public String say();

}

public class LamdaHello {

	public static void main(String[] args) {
		// TODO 
		 Hello s=()->{  
		        return "Hello world";  
		    };  
		    System.out.println(s.say());  
		}  
		

	}


