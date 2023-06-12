package text;
import java.util.Scanner;
import com.iet.service.ShapeService;

public class TestShapeHirarchy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		     System.out.println("1.add new shape\n2. display all\n3. calaulate area and perimeter specific shapes 4. exit\n \n Choice :");
		     choice=sc.nextInt();
		     switch(choice) {
		     case 1:
		    	 System.out.println("1. Triangle \n2. Rectangle \n3. Circle \n ");
		    	 int ch=sc.nextInt();
		    	 ShapeService.addnewShape(ch);
		    	 break;
		     case 2:
		    	 ShapeService.displayAll();
		    	 break;
		     case 3:
		    	 System.out.println("enetr id to search");
		    	 int id=sc.nextInt();
		    	 String data=ShapeService.CalculateDetails(id);
		    	 if(data!=null) {
		    		 System.out.println("perimeter and area : "+data);
		    	 }
		    	 else {
		    		 System.out.println("not found");
		    	 }
		    	 break;
		     case 4:
		    	 sc.close();
		    	 System.out.println(" Thank you for visiting....");
		    	 break;
		    default:
		    	System.out.println(" Wrong choice ");
		     }
		
		}while(choice!=4);
//		System.out.println("ravi");
		String ans=ShapeService.calculateNumber();
		System.out.println(ans);

	}

}
