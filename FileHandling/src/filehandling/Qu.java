package filehandling;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Qu {

	public static void main(String[] args) {
		
		Comparator<Employee> c = new Comparator<Employee>() {
			@Override
			public int compare(Employee ob1, Employee ob2) {
					if(ob1.getSal()<ob2.getSal()) {
						return -1;
					}
					else if(ob1.getSal()==ob2.getSal()) {
						if(ob1.getEmpid()<ob2.getEmpid()) {
							return -1;
						}
						else if(ob1.getEmpid()==ob2.getEmpid()) {
							return 0;
						}
						else {
							return 1;
						}
					}
					else {
						return 1;
					}
			}
		};
		
		PriorityQueue<Employee> q = new PriorityQueue<>(c);
		q.add(new Employee(2,"B",6000));
		q.add(new Employee(3,"C",5000));
		q.add(new Employee(1,"a",7000));
		
		System.out.println("\nHead is==>"+q.peek());
		
		Iterator<Employee> it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		int [] arr = new int[100]; 
//		Arrays.fill(arr, 5);
//		System.out.println(Arrays.toString(arr));		
		
	}

}
