// Create a lambda to find the even and odd value
package com.globallogic.July25;

import java.util.*;

interface Even_odd {
	public void even(int x);

}

public class Lamda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		// int b= sc.nextInt();
		Even_odd A = (a) -> {
			if (a % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}

		};
		A.even(sc.nextInt());

	}

}
