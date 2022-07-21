package com.globallogic.Day3;

class A1 {

	A1() {
		System.out.println("constructor of base class");

	}

	public void boy() {
		System.out.println("base class boy");
	}

}

class B1 extends A1 {
	B1() {
		super();
		System.out.println("child class");
	}

	public void boy() {
		System.out.println("child class boy");
		super.boy();
	}

}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();
		obj.boy();

	}

}
