package com.globallogic.July20;


	

public class MyGenric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      Student<Integer,String> obj = new Student<Integer,String>(5,"ram");
		      

		     
		   

		      System.out.println( obj.t+" "+obj.a);
		      
		   }
		

	}
class Student<T,M> {
    T t;
    M a;

   Student(T t, M a) {
      this.t = t;
      this.a=a;
   }
}



