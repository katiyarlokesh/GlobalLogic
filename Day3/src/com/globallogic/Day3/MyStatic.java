//Write a program to store and display the employee and dept details using the static keyword
package com.globallogic.Day3;

class Emp {
	int id;
	static String Dep = "testing";

	Emp(int id) {
		this.id = id;

	}

	void display() {
		System.out.println(id + " " + Dep);
	}

	static {
		System.out.println("i am the first employee");

	}
	public static void employee(){
		System.out.println("i do'nt need any object");
	}
}

public class MyStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp.employee();
		Emp obj = new Emp(11);
		Emp obj1 = new Emp(15);
		obj.display();
		obj1.display();
		

	}

}
