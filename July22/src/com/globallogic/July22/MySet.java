//Create A set with all the implanatation with user defined class employee and perform the insert delete and searching and sorting
package com.globallogic.July22;
import java.util.*;


public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> cd= new HashSet<Integer>();
		cd.add(4);
		cd.add(45);
		cd.add(12);
		cd.add(2);
		
		cd.remove(45);
		System.out.println(cd);
		Set<Integer> cd1 = new TreeSet<Integer>(Collections.reverseOrder());//comprator interface
		cd1.add(2);
		cd1.add(23);
		cd1.add(1);
		System.out.println(cd1);
		
		
		

	}

}
