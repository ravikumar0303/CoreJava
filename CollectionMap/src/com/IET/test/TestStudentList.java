package com.IET.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestStudentList {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Map<Integer,String> std=new HashMap<>();
			//add data
			std.put(117,"ravi");
			std.put(57,"vishal");
			std.put(92,"samim");
		    std.put(114,"pankaj");

			int choice = 0;

			do {
				System.out.println("1.Display All\n 2.Add new Student\n 3.Delete student\n4.Exit");			
				System.out.println("\nChoice : ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Student-->"+std.entrySet());
					break;
				case 2:
					
				      	System.out.println("! sorry case not Found.");
					break;
				case 3:
					System.out.println("! sorry case not Found.");
					break;
				case 4:
					sc.close();
					System.out.println("Thank's For Visiting.....\n<..Have A Grate Day..>");
					break;
				default:

				}

			} while (choice != 4);
		}

	

		
		
		
	}


