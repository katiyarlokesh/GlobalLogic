// Create a Student with with 5 paramters and make this class generic
package com.globallogic.July20;

public class GenricClass<a, b, c, d, e> {
	
	a x;
	b y;
	c z;
	d l;
	e m;
	GenricClass(a x,b y,c z,d l,e m){
		this.x=x;
		this.y=y;
		this.z=z;
		this.l=l;
		this.m=m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenricClass<String,String,String,String,String> obj= new GenricClass<String,String,String,String,String>("ram","sd","sdf","sdfd","ewr");
		System.out.println(obj.x+" "+'y'+" "+'z'+" "+'l'+" "+'m');
		

	}

}
