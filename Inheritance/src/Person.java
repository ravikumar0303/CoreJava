
public class Person {
	private int pid;
	private String pname;
	private String pmobile;

	public Person() {
		System.out.println("person default");
	}

	public Person(int id, String name, String mobile) {
		this.pid = id;
		pname = name;
		pmobile = mobile;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int id) {
		this.pid = id;
	}

	public void setPname(String name) {
		this.pname = name;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPmobile(String mobile) {
		this.pmobile = mobile;
	}

	public String getPmobile() {
		return this.pmobile;
	}

	protected int m1() {
		System.out.println("in Person  m1");
		System.out.println("in m1");
		return 10;
	}

	public String toString() {
		return "Id: " + pid + "\nName: " + pname + "\nMobile: " + pmobile;
	}
}
