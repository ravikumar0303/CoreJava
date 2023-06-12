package com.IET.test;

import java.util.Scanner;
import com.IET.service.StudentService;
import com.IET.service.StudentServiceImp;

public class TestStudentList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentServiceImp();

		int choice = 0;

		do {
			System.out.println("1.Display All\n 2.Add new Student\n 3.Delete student\n4.Exit");			
			System.out.println("\nChoice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
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
