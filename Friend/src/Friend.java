import java.util.Date;
import java.text.SimpleDateFormat;

public class Friend 
{ 
	private String fname;
	private String mobile;
	private String location;
	private Date bdate;
	
	public Friend()
	   {
		this(null,null,null,null);
	   }
    public Friend(String fname, String m, String location, Date dbt)
       {
		
		this.fname = fname;
		this.mobile = m;
		this.location = location;
		this.bdate = dbt;
       }

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname) 
	{
		this.fname = fname;
	}

	public String getMobile() 
	{
		return mobile;
	}

	public void setMobile(String m)
	{
		this.mobile = m;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public Date getBdate() 
	{
		return bdate;
	}

	public void setBdate(Date bdate) 
	{
		this.bdate = bdate;
	}
	public String toString() {
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		String bdt=sdt.format(this.bdate);
		return "Name : "+fname+"\nMobile: "+this.mobile+"\nlocation: "+this.location+"\n Birt date: "+ bdt;
	}	

	
	
	
}
