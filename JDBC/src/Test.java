import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.10.150:3306/dac57","dac57","welcome");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select ename from emp");
			while(rs.next()) {
				String x = rs.getString("ename");
				System.out.println(x);
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
