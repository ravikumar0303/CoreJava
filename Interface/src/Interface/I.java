package Interface;

public interface I {
	int i=12;
	void m11();
	void m12();
	
	public static void  methiodstatic() {
		System.out.println("in static method 31");
	}
	default int m31(int x) {
		System.out.println("in default method 31"); 
		return x+10;
		
	}


}
