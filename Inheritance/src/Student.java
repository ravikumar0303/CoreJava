
public class Student extends Person {
	private int m1, m2, m3;

	public Student(int id, String name, String mobile, int m1, int m2, int m3) {
		super(id, name, mobile);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public Student() {
		System.out.println("Student default");
	}

//	private int m1() {  ----Do not Increase the Restriction in child class
    public int m1() {
		System.out.println("in Student  m1");
		System.out.println("in m1");
		return 20;
	}

	public String toString() {
		return super.toString() + "\nM1:" + m1 + "\nM2:" + m2 + "\nM3:" + m3;
	}
}
