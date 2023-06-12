
public class PhdStudent extends Student {
	
	private String  thesis;
	private int spsubject_marks;
	
	public PhdStudent() {
		
	}

   public PhdStudent(String thesis,int spsubject_marks) {
	   this.thesis=thesis;
	   this.spsubject_marks=spsubject_marks;
	   
   }

   
@Override
public String toString() {
	return "PhdStudent [thesis=" + thesis + ", spsubject_marks=" + spsubject_marks + "]";
}	
   

   
   
}
