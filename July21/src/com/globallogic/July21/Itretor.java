package com.globallogic.July21;
import java.util.*;

public class Itretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls = new ArrayList<String>();
		// add method is use to add the value to list
		ls.add("ravinder");
		ls.add("kumar");
		ls.add("ajay");
		ls.add("zee");
		
		Iterator<String > it=  ls.iterator();
		//it will check there is any next element is there or not
		//it will return true if there is any element
		//it will return false if there is not element
		
		
		
		
		while(it.hasNext())
		{
			String element=it.next();
		 
			System.out.println("element is "+element);

}
		

	
	//System.out.println("element is "+it);
	}

}
