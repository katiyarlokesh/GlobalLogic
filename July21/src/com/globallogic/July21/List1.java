package com.globallogic.July21;

import java.util.*;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<100;i++){
		System.out.println("1: for add");
		System.out.println("2: for delete");
		System.out.println("3: for update");
		System.out.println("4: for highest salery");
	
		System.out.print("Make your choice: ");
		int ch = sc.nextInt(); // reading user's choice
		List<Object> employee = new ArrayList<Object>();
		employee.add("Rohan");

		employee.add("Preet");
		employee.add("Karna");
		employee.add("Pavan");
		employee.add(2000);
		employee.add(200);
		employee.add(42325);
		
		System.out.println("intial list is"+" "+employee);
		Object max= employee.get(0);

		switch (ch) {
	
		case 1:
			System.out.print("selected for the adding \n");
			employee.add("Aaksh");

			employee.add("Rahul");
			employee.add("Ram");
			employee.add("krishna");
			System.out.println("Employees name are" + " " + employee);

			break;
		case 2:
			System.out.print("selected for deleting \n");
			employee.remove(1);

			System.out.println("Employees name are" + " " + employee);

			break;
        case 3: 
            System.out.print("selected for the updating \n");
            employee.set(1,"Bheem");

    	
    		System.out.println("Employees name are"+" "+employee);
          
            break;
       
        	
        
        default:
            System.out.println("Invalid choice! Please make a valid choice. \n\n");
          }
		}
	}
}


/*
 * List<String> employee= new ArrayList<String>(); employee.add("Aaksh");
 * 
 * employee.add("Rahul"); employee.add("Ram"); employee.add("krishna");
 * System.out.println("Employees name are"+" "+employee); employee.remove(1);
 * System.out.println("After deletion"+" "+employee); employee.get(0);
 * System.out.println("name at index zero"+" "+employee); employee.set(1,
 * "Radhe"); System.out.println("After update"+" "+employee);
 * Collections.sort(employee);
 * System.out.println("After sorting "+" "+employee);
 * 
 * 
 * 
 * 
 * }
 */
