// find the grestest number between two numbers using lamda expression
package com.globallogic.July25;
import java.util.*;
interface Max234{
	public void max(int x,int y);
}

public class Max2344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Max234 l = (a,b)->
		{
			if(a>b){
				System.out.println("a is big")
				;
				
			}
			else{
				System.out.println("b is big");
			}
		};
		l.max(sc.nextInt(),sc.nextInt());
		

	}

}



