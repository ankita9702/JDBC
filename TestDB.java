package jdbcpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

public class TestDB {
	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("connected");
		
		
		
		/*Statement st = conn.createStatement();
		String qry = "insert into employee values(109, 'Ankita', 8907)";
		st.executeUpdate(qry);*/
		
		String qry = "insert into employee values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		
		/*pst.setInt(1, 114);
		pst.setString(2, "Abinash");
		pst.setDouble(3, 11476);*/
		
		int rows;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				System.out.println("Enter the Employee Code"); 
				int code = Integer.parseInt(br.readLine());
				System.out.println("Enter the Employee Name"); 
				String name = br.readLine();
				System.out.println("Enter the Employee Salary");
				double salary = Double.parseDouble(br.readLine());
				pst.setInt(1, code);
				pst.setString(2, name);
				pst.setDouble(3, salary);
				rows = pst.executeUpdate();
				System.out.println("inserted "+rows);
				System.out.println("Enter 0 to exit or Press any other key to continue");
				int flag = Integer.parseInt(br.readLine());
				if(flag==0)
					break;
				else
					continue;
			}
			catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			} 
		};
		conn.close();
	}
}
