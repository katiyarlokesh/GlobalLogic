package com.globallogic.July27;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.*;


public class MyStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(23);
		ls.add(-24);
		ls.add(1);
		ls.add(1234);
		// making of stream
		Stream<Integer> st = ls.stream();
		/*first method to print stream data
		for(Integer a:ls){
			System.out.println(a);
		}*/
		// print data using forEach method of stream
		st.forEach(e->System.out.println(e));
		//short method to print stream
		ls.stream().forEach(System.out::println);
		

	}

}
