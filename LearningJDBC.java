package jdbc;
import java.sql.*;

public class LearningJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "USER_AFRAH";
		String password = "Afrahs95";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		//1st
	    /*String createQ ="create table Day8(ID NUMBER(2),NAME VARCHAR(10),SUBJECT VARCHAR(10),MARKS NUMBER(3))";
		stmt.executeUpdate(createQ);
		
		String Inval ="INSERT INTO DAY8 VALUES(1,'ABCDE','CSE',45)";
		stmt.executeUpdate(Inval);
		
		String Inval2 ="INSERT INTO DAY8 VALUES(2,'hgdaDE','hcE',95)";
		stmt.executeUpdate(Inval2);*/
		
		ResultSet rs=stmt.executeQuery("select * from day8");
		
		//3RD
		/*ResultSet rs=stmt.executeQuery("select * from day8 order by marks desc");
		
		while(rs.next()) {
			System.out.println(rs.getInt("ID")+" : "+rs.getString("NAME")+" : "+rs.getString("SUBJECT")+" : "+rs.getInt("MARKS"));
		}*/
		
		//5th
		while(rs.next()) {
			if(rs.getInt("MARKS")>=40) 
				System.out.println(rs.getInt("ID")+" : "+rs.getString("NAME")+" : "+rs.getString("SUBJECT")+" : "+rs.getInt("MARKS")+"::pass");
			else
				System.out.println(rs.getInt("ID")+" : "+rs.getString("NAME")+" : "+rs.getString("SUBJECT")+" : "+rs.getInt("MARKS")+"::fail");
			
		}
		
		
		con.close();
	}

}
