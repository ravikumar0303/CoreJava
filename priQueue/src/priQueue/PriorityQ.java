package priQueue;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue();
		
		q.offer(12);
		q.offer(23);
		q.offer(45);
		q.offer(56);
		q.offer(9);
		q.offer(78);
		q.offer(3);
		q.offer(4);
		q.offer(16);
//		System.out.println(q.peek());
		System.out.println("\nwithout Comparator value-->"+q+"\n");
		Comparator<Integer> r=(v1,v2)->{
//			System.out.println("hello")
			System.out.println("\nvalue--"+v1+"---"+v2);
			if(v1<v2)
				return -1;
			else if(v1==v2)
				return 0;
			else
			return -1;
			
		};
		Queue<Integer> que=new PriorityQueue();
		que.add(25);
		que.add(56);
		que.add(58);
		que.add(96);
		que.add(5);
		que.add(6);
		que.add(8);
		que.add(9);
		//peek print head 
//		System.out.println(que.peek());
		//poll remove head
//		System.out.println(que.poll());
		
		System.out.println("using Comparator Priority 1st value-->"+que);
		
		que.remove(96);
		System.out.println("remove Element '96' value-->"+que);

	}

}
