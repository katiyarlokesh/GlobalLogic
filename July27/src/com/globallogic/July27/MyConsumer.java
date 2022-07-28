package com.globallogic.July27;

import java.util.Arrays;
import java.util.List;
import java.util.*;

import java.util.function.Consumer;

public class MyConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> cities = Arrays.asList(1, 2, 3, 4, 5);
		Consumer<Integer> printconsumer = s->System.out.println(s);
		Consumer<List<Integer>> printconsumer1 =list->list.stream().forEach(System.out::println);
Consumer<List<Integer>> upperCaseConsumer=list->{
			
			for(int i=0;i<list.size();i++ )
			{
				list.set(i,list.get(i)*2);
			}
		};
		upperCaseConsumer.andThen(printconsumer1).accept(cities);
		

	}

}
