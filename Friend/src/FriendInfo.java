import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class FriendInfo 
{
		
	private static Friend[] ferarr;
	private static int cnt;
	static {
		ferarr=new Friend[50];
		ferarr[0]=new Friend("Rajan","33333","Pune",new Date());
		ferarr[1]=new Friend("Revati","4444","Pune",new Date());
		ferarr[2]=new Friend("Atharv","5555","Pune",new Date());
		cnt=3;

          }
	
	public static void AddFriend() 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter pid");
		//int pid=sc.nextInt();
		//sc.nextLine();
		System.out.println("enter fname");
		//sc.nextLine();
		String fname=sc.nextLine();
		
		System.out.println("enter mobile");
		String m=sc.next();
		//System.out.println();
		//sc.nextLine();
		System.out.println("enter location");
		String location=sc.next();
		
		System.out.println("enter bdate(dd/mm/yyyy)");
		String bdt=sc.next();
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=null;
		try {
		  dt=sdt.parse(bdt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		ferarr[cnt]=new Friend(fname,m,location,dt);
		cnt++;
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(ferarr[i]);
		}
		/*for(Friend ob:ferarr) {
			if(ob!=null)
				System.out.println(ob);
			else
				break;
		}*/
		
	}
	public static int searchByName(String nm) {
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			if(ferarr[i].getFname().equals(nm)) {
				System.out.println(ferarr[i]);
				Tester.ob = ferarr[i];
				System.out.println(ferarr[i].getMobile());
				cnt1++;		
			}
		}
		
		return cnt1;
	}
	public static int searchByLocation(String location) {
		// TODO Auto-generated method stub
		
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			if(ferarr[i].getLocation().equals(location))
					{
				System.out.println(ferarr[i]);
				//Tester.ob = ferarr[i];
				//System.out.println(ferarr[i].getMobile());
				cnt1++;		
			}
		}
		
		return cnt1;
		
	}
}