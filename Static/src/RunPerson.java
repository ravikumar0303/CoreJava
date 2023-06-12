import java.util.Date;

public class RunPerson {
	public static void main(String args []) {
		
		Person p=new Person("ravi","123456987", new Date() );
		Person p1=new Person("Node js","123456941", new Date() );
		Person p2=new Person("React","123456978", new Date() );
		Person p3=new Person("Ajax","1234512", new Date() );
//		System.out.println(p);
		System.out.println(p+"\n \n"+p1+"\n \n"+p2+"\n \n"+p3);
//		System.out.println(" \n"+p2);
//		System.out.println("\n "+p3);
	}

}
