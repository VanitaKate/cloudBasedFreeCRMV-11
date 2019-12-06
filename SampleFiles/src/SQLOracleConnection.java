import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLOracleConnection {

	public static void main(String[] args) throws SQLException {
	/*	String S1="GeeksForGeeks";
		char[] CharArray=S1.toCharArray();
		for (char c: CharArray){
		System.out.println(S1.indexOf("e"));
		
		//span[@id='1575226132079-uiGrid-0007-header-text']
		//span[@id='1575226132079-uiGrid-0008-header-text']
		//span[@id='1575226132079-uiGrid-0005-header-text']
		//span[@id='1575226132079-uiGrid-0006-header-text']*/
		
		//Class.forname("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("JDBC:MySQL://localhost:3306/EMPLOYEE", "root", "Hariom001");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from employee");
		System.out.println("No. of Rows in the query result are: "+rs.getFetchSize());
		while (rs.next()) {
			
			String cusName=rs.getString(1);
			System.out.println("Customer name is: "+cusName);
		}
		
		
		}
	}

//}
