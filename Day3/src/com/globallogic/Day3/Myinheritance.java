package com.globallogic.Day3;

class A {
	public void A() {
		System.out.println("class a");
	}
}

class B extends A {
	public void B() {
		System.out.println("class b");
	}
}

public class Myinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		obj.B();
		obj.A();

	}

}
