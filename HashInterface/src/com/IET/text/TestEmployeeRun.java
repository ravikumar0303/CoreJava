package com.IET.text;

import java.util.Scanner;
import java.util.Set;

import com.IET.beans.Employee;
import com.IET.services.EmployeeService;
import com.IET.services.EmployeeServiceImplement;

public class TestEmployeeRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeServiceImplement();
		int choice = 0;
		do {
			System.out.println("\n<1>..Add New Employee\n<2>..Display All\n<3>..Disaly By Id\n<4>..Display By Name");
			System.out.println("<5>..Sort By Sal\n<6>..Sort By Name\n<7>..Modify Sal\n<8>..Delete By Id\n<9>..Exit");
			System.out.println("\nChoice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				es.addnewEmployee();
				break;
			case 2:
				Set<Employee> r = es.displayAll();
				r.forEach(a -> {
					System.out.println(a);
				});
				break;
			case 3:
				System.out.println("Enter Serach Employee ID.");
				int id = sc.nextInt();
				Employee e = es.displayById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Employee Not Found.");
				}
				break;

			case 4:
				System.out.println("Emter Serach By Name .");
				String n = sc.next();
				Set<Employee> nlist = es.displayByName(n);
				if (nlist != null) {
					nlist.forEach(a -> {
						System.out.println(a);
					});
				} else {
					System.out.println("Employee Not Found !");
				}
				break;

			case 5:

				nlist = es.SortBysal();
				nlist.forEach(a -> {
					System.out.println();
				});
				break;
			case 6:
				nlist = es.SortByName();
				nlist.forEach(a -> {
					System.out.println(a);
				});
				break;
			}
		} while (choice != 9);

	}
}