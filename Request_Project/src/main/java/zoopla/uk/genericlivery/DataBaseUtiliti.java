package zoopla.uk.genericlivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DataBaseUtiliti {

	public static ArrayList<String> getDataTableColumn(String SQLqyeries, String columnName) {
		ResultSet rs = null;
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQLqyeries);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ArrayList<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
				columnValue.add(rs.getString(columnName));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(columnValue);
		// step5 close the connection object
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return columnValue;

	}

	public static void main(String[] args) {
		String employees = "select * from employees";
		String salary = "select salary from employees";
		getDataTableColumn(employees, "first_name");
		getDataTableColumn(salary, "salary");
	  // getDataTableColumn(Queries, "max(salary)");
		
		ResultSet rs = null;  // ResultSet is a interface 
		Connection connection = null; // Connection is a interface 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");   // Location of the JDBC or Path of JDBC
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			                                                                            // JDBC URL, Host Number, Database Name, UserName & Password
			
			// Statement is an interface 
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("select * from employees");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		ArrayList<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
				columnValue.add(rs.getString("First_name"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//System.out.println(columnValue);
		// step5 close the connection object
		// step5 close the connection object
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
