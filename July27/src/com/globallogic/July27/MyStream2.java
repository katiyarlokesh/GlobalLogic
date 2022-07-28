package com.globallogic.July27;

import java.util.*;

public class MyStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls =  Arrays.asList(2,12,3,10,100);
		System.out.println(ls);
		// apply reduce() from stream API
		System.out.println(ls.stream().filter(e->e%5==0).reduce(0,(c,e)->c+e));
		List<Integer> ls1=ls.stream().filter(e->e%2==0).reduce(0,(c,e)->c+e).coll
				//still pending reduce in stream 
		
		

	}

}
