
public class FunctionOverloading {
	final int d;
	public FunctionOverloading() {
		d=23;
		
	}
//	public  int add(int a,int b) {
//		System.out.println("in int method");
//		return a+b;
//	}
//	public int add(Integer a,Integer b) {
//		System.out.println("in integer method");
//		return a+b;
//	}
//	public long add(long a,long b) {
//		System.out.println("in long method");
//		return a+b;
//	}
	public Object add(Object a,Object b) {
		System.out.println("in Object method");
		return new Object();
	}
	public Long add(Long a,Long b) {
		System.out.println("in Long method");
		return a+b;
	}
	/*public int add(int a,int b,int c) {
		System.out.println("in 3 int method");
		return a+b+c;
	}*/
	//variable number of parameters
//	public int add(int a,int b,int...c) {
//		System.out.println("in multi variable  method");
//		return 10;
//	}
	public String add(String a,String b) {
		System.out.println("This is String method");
		return a+b;
	}
	public static void main(String[] args) {
		
		FunctionOverloading ob=new FunctionOverloading();
		
		 String a="10";
		 String b="34";
		 ob.add(a,b); //long
//		ob.add(1, 2);
//		ob.add(1, 2,3);
		//ob.add(1, 2,4,5,6,7,3);
		ob.add("Hello", "World");
		ob.add(2l, 3l); //long
		//ob.add('c', 'x');
	}
	

}