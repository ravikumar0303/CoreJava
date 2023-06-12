package com.IET.test;


import java.util.List;
import java.util.Scanner;


import com.IET.beans.Employee;
import com.IET.service.EmployeeService;
//import com.IET.service.EmployeeDaoImplement;
import com.IET.service.EmployeeServiceImplement;

public class TestEmployeeList {


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
				List<Employee> list = es.displayAll();

//				 java 7		
//				for(Employee ob:list) { System.out.println(ob); }

				// java 8
				list.forEach(ob -> {
					System.out.println(ob);
				});
				break;
			case 3:
				System.out.println("Enter your EmployeeID.");
				int id = sc.nextInt();
				Employee r = es.SearchByID(id);
				if (r != null)
					System.out.println(r);
				else {
//				{
					System.out.println("Employee Not Found.");
				}
				break;
			case 4:
				System.out.println("Enter  your Find Name. ");
				String n = sc.next();
				List<Employee> nlist = es.SearchByName(n);
				if (nlist != null) {
					nlist.forEach(v -> {
						System.out.println(v);
					});
				} else {
					System.out.println("Employee Not Found..");
				}
				break;
			case 5:
				List<Employee> elist=es.SortBySal();
				elist.forEach(v->{System.out.println(v);});
				break;
			case 6:
				
				break;
//			case 8:
//				System.out.println("Enter your Deleting ID");
//				id=sc.nextInt();
//				status=es.DeleteById(id);
//				if(status==true) {
//					System.out.println("ID"+id+" Delete Successfully..");
//				}
//				else {
//					System.out.println("ID Not Found...");
//				}
//				break;
			case 9:
				sc.close();
				System.out.println("Thank's For Visiting.....\n<..Have A Grate Day..>");
				break;
			default:

			}

		} while (choice != 9);

	}
}
