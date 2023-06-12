package priQueue;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> st=new Stack();		
		st.push("Hello");
		st.push("Welcome");
		st.push("To");
		st.push("IET");
		st.push("Acts");
	
		System.out.println("Stack implement..>"+st);
		
		st.peek();
		st.pop();
		System.out.println("Stack implement..>"+st);
	}
}
