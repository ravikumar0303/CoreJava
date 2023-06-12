package com.IET.test;


import java.io.FileNotFoundException;
import java.util.Scanner;
import com.IET.beans.WrongAgeException;

public class CustomerException {
	


		public static void acceptdata() throws WrongAgeException {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Age.");
			int age=sc.nextInt();
			if((age <18) || (age>60))
				throw new WrongAgeException("age should be between 18 and 60");
			System.out.println("Your Age is Accept.");
		}
	public static void main(String[] args) {
		try {
		   acceptdata();
		}catch(WrongAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	}


