import java.util.Queue;
import java.util.LinkedList;

public class Queuetest {
	public static void main(String[] args) {
		
		Queue<String> q=new LinkedList();
		q.add("Apple");
		q.add("banana");
        q.add("cherry");
 
   System.out.println(q);
   q.remove();
   System.out.println(q);
	
}

}
