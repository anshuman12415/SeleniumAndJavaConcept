package JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExamples {

	/*
	 * 1. Create a connection 2 .Create a query/ statement 3 .Execute
	 * statement/query 4. Close connection
	 */
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "hr", "hr");

		Statement st = con.createStatement();
		String s = "insert into new value(101,'scott')";
		st.execute(s);
		con.close();
		System.out.println("program is completed");
	}
}
