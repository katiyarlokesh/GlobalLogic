package com.globallogic.July21;

import java.util.*;

public class Student {
	String Name;
	int Age;

	public Student(String Name, Integer Age) {

		this.Name = Name;
		this.Age = Age;
	}

	// Getter setter methods
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// Method
	// Overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}

	// Class 2
	//  implementing Comparator interface
	static class CustomerSortingComparator implements Comparator<Student> {

		// Method 1
		// To compare customers
		@Override
		public int compare(Student customer1, Student customer2) {

			// Comparing customers
			int NameCompare = customer1.getName().compareTo(customer2.getName());

			int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<>();

		Student obj1 = new Student("Ajay", 27);
		Student obj2 = new Student("Sneha", 23);
		Student obj3 = new Student("Simran", 37);
		Student obj4 = new Student("Ajay", 22);
		Student obj5 = new Student("Ajay", 29);
		Student obj6 = new Student("Sneha", 22);

		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		Iterator<Student> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");

		while (custIterator.hasNext()) {

			System.out.println(custIterator.next());
		}

		Collections.sort(al, new CustomerSortingComparator());

		System.out.println("\n\nAfter Sorting:\n");

		for (Student customer : al) {
			System.out.println(customer);

		}

	}
}
