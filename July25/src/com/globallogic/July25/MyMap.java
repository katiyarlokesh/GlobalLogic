package com.globallogic.July25;
import java.util.*;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map =new HashMap<String,Integer>();
		map.put("Ram", 4);
		map.put("Laxman", 2);
		map.put("bharat", 12);
		System.out.println(map);
		for(Map.Entry<String, Integer>  entry:map.entrySet())//by using entry interface
		{
			System.out.println("Key "+entry.getKey() +" value "+entry.getValue());
		}
		map.remove("Ram");
		System.out.println(map);
		
		
		
		

	}

}
