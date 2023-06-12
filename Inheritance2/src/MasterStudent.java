
public class MasterStudent extends Student {

	private int m4, m5, spcourse_marks;

	public MasterStudent() {

	}

	public MasterStudent(int m4, int m5, int spcourse_marks) {
		this.m4 = m4;
		this.m5 = m5;
		this.spcourse_marks = spcourse_marks;

	}

	@Override
	public String toString() {
		return "MasterStudent [m4=" + m4 + ", m5=" + m5 + ", spcourse_marks=" + spcourse_marks + "]";
	}

}
