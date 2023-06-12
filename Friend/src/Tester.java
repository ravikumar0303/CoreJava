import java.util.Scanner;
public class Tester {
	
public	static Friend ob=new Friend();
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
	do {
		System.out.println("1.Add New Friend\n 2.Search by Name \n 3.Search by Add\n");
		System.out.println("4.Show all Friends\n 5.Search Friend in Location\n 6.Exit\n");
		choice =sc.nextInt();
		switch(choice) 
	   {
	   case 1:
		   FriendInfo.AddFriend();
		   break;
	   case 2:
		   
		   System.out.println("enter name");
		   sc.nextLine();
		   String nm=sc.nextLine();
		   int cnt=FriendInfo.searchByName(nm);
		   //check whether found data
		   if(cnt!=0) {
			   System.out.println(cnt+"Number of person with name "+nm);
			   System.out.println("\nmobile: "+ob.getMobile());
		   }else {
			   System.out.println("not found");
		   }
		   break;
		   
	   case 3:
		   System.out.println("enter name");
		   sc.nextLine();
		   String nm1=sc.nextLine();
		   int cnt1=FriendInfo.searchByName(nm1);
		   //check whether found data
		   if(cnt1!=0) {
			   System.out.println(cnt1+"Number of person with name "+nm1);
		   }else {
			   System.out.println("not found");
		   }
		   break;
		   
	   case 4:
//		  
		   FriendInfo.displayAll();
		   break;
	   case 5:
		   System.out.println("enter Search By Location.");
		   sc.nextLine();
		   String location=sc.nextLine();
		   int cn=FriendInfo.searchByName(location);
		   //check whether found data
		   if(cn!=1) {
			   System.out.println("Location:"+location);
			   //System.out.println("name:"+ob.getFname());
		   }else {
			   System.out.println("Location Not Found");
		   }
		    
		     FriendInfo.searchByLocation(location);
		   break;
	   case 6:
		   System.out.println("Thank You For Visiting.......");
		   break;
	   default: 
		   System.out.println("Wrong Choice Please Enter Correct Choice.");
		   break;
	   }
	   }while(choice!=6);
	}

}
