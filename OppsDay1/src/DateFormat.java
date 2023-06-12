import java.text.ParseException;

import java.util.Scanner;
// to import SimpleDateFormat library
import java.text.SimpleDateFormat;
//import Date Library
import java.util.Date;
public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To print Simple Date 
		Date d=new Date();	
		System.out.println(d);
		
		
		//To print data Used Formating
		
		SimpleDateFormat dbt=new SimpleDateFormat("dd/MM/yyyy");
	//	To convert date from java format to String format 
		String sd=dbt.format(d);
		System.out.println(sd);
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data format (dd/mm/yyyy)");
		String date1=sc.next();
		try {
			 Date r1=dbt.parse(date1);
			 System.out.println("Convert date in java Format:");
			 System.out.println(r1);
		}catch (ParseException a) {
			System.out.println(a);
		}

	}

}
