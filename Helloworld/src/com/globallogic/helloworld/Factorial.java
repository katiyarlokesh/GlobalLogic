//Java program to calculate a Factorial of a number
package com.globallogic.helloworld;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the desired number");
		int num = sc.nextInt();
		 
	        long factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	            
	            factorial *= i;
	        }
	        System.out.println( factorial);
	    }
		

	}


