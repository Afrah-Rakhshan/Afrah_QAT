package jdbc;
import java.sql.*;
public class Q2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "USER_AFRAH";
		String password = "Afrahs95";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String updateQ = "update day8 set name='Afrah' where id=3 ";
		stmt.executeUpdate(updateQ);
		
		ResultSet rs = stmt.executeQuery("select * from day8");
		
		while(rs.next()) {
			System.out.println(rs.getInt("ID")+" : "+rs.getString("NAME")+" : "+rs.getString("SUBJECT")+" : "+rs.getInt("MARKS"));
		}
	}

}
