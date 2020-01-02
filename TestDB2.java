package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class TestDB2 {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("connected");
		
		String qry = "update employee set empname=?,salary=?where empcode=?";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setString(1, "Aish");
		pst.setInt(2, 43567);
		pst.setInt(3, 114);
		
		int rows = pst.executeUpdate();
		System.out.println(rows);
		
		String qry1 = "delete from employee where empcode=?";
		PreparedStatement pst1 = conn.prepareStatement(qry1);
		pst1.setInt(1, 114);
		rows = pst1.executeUpdate();
		System.out.println(rows);
		
		conn.close();
	}
}
