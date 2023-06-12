import java.util.Date;
import java.text.SimpleDateFormat;

public class Person {

	static int cnt;
	static {
		cnt = 117;
	}

	private String pid;
	private String pname;
	private String mobile;
	private Date Bdate;

	private String generateCode(String pname) {

		if (pname != null)

		{
			return pname.substring(0, 0) + cnt++; // +cnt;
		}

		return "" + cnt;

	}

	public Person() {

	}

	public Person(String pname, String mobile, Date Bdate) {
//		this.pid = pid;
		this.pid = generateCode(pname);
		this.pname = pname;
		this.mobile = mobile;
		this.Bdate = Bdate;
	}

//	SimpleDateFormat bdate=new SimpleDateFormat("dd/MM/yyyy");
//	public String getPid(int p) {
//		return pid=p;
//	}

//	public void setPid(int pid) {
//		this.pid = pid;
//	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getmobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getBdate() {
		return this.Bdate = Bdate;
	}

	public void setBdate() {
		this.Bdate = Bdate;
	}

	public String toString() {
		SimpleDateFormat bdate = new SimpleDateFormat("dd/MM/yyyy");
		String Bdate = bdate.format(this.Bdate);
		return "ID: " + pid + "\nName :" + pname + "\nMobile: " + mobile + "\nBirth Date: " + Bdate;
	}
}
