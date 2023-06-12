package com.IET.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.IET.beans.Student;
import com.IET.service.StudentService;
import com.IET.service.StudentServiceImp;

public class StudentRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentService es = new StudentServiceImp();
		int choice = 0;
		do {
			System.out.println("\n<1>..Add New Student\n<2>..Display All\n<3>..Dispaly By Id\n<4>..Display By Name");
			System.out.println("<5>..Sort By ID\n<6>..Sort By Name\n<7>..Modify ID\n<8>..Delete By Id\n<9>..Exit");
			System.out.println("\nChoice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				es.addnewStudent();
				break;
			case 2:
				Map<Integer,Student> r=es.displsyAll();
				r.keySet().forEach(Key->System.out.println(" "+Key+"-->"+r.get(Key)));
			 break;
			 
			case 3:
				System.out.println("Enter Student Search ID:");
				int id=sc.nextInt();
				Student s1=es.displayById(id);
				if(s1!=null) {
					System.out.println(s1);
				}
				else {
					System.out.println("Student Not Found !");
				}
				break;
			case 4:
				System.out.println("Enter Student Search name:");
				String nm=sc.next();
				Set<Student> Sset=es.displayByName(nm);
				if(Sset!=null) {
					Sset.forEach(s->{System.out.println(s);});
				}
				else {
					System.out.println("Student Not Found..");
				}
				break;
			case 5:
				System.out.println("Sorry !"+"\nCase Not Found.");
				break;
			case 6:
				
				Sset=es.sortByName();
				Sset.forEach(a->{System.out.println(a);});
				break;
			case 7:
				System.out.println("Enter Student name:");
				nm=sc.next();
				System.out.println("Enter student New Id:");
				int newid=sc.nextInt();
				System.out.println("Sorry !|\n programm is Process..");
				
				 boolean status=es.modifyById(nm,newid);
				 if(status) {
					 System.out.println("Student ID Update Successfully...");
					 
				 }
				 else {
					 System.out.println("ID Not Found..");
				 }
				break;
				
			case 8:
				System.out.println("Enter Delete Student ID:");
				id=sc.nextInt();
				 status=es.deleteById(id);
				if(status) {
					System.out.println("Delete successfully..");
				}
				else if(status) {
					System.out.println("Id is Not Delete..");
				}
				else {
					System.out.println("ID not Found..");
				}
				break;
			
			case 9:
				sc.close();
				System.out.println("Thank's For Visiting.....\n<..Have A Grate Day..>");
				break;
			default :
				
			}
	
		}while(choice !=9);

		}
}
