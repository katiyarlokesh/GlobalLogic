package com.globallogic.July18;

class A {
	public void Ram() {
		System.out.println("base class");
	}
}

class B extends A {
	public void Ram() {
		System.out.println("child class");
	}

}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj =new B();
		obj.Ram();
		A obj1 = new A();
		obj.Ram();
		
		
	}

}
