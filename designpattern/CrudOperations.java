package com.tyss.designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class CrudOperations {
	public EmployeePrimaryInfo getDetailsOnEid(int eid) throws IOException {

		Connection conn = null;
		PreparedStatement prepstmt = null;
		ResultSet rs = null;

		FileInputStream inputstream = new FileInputStream("task.properties");
		Properties pro = new Properties();
		pro.load(inputstream);

//		String name = (String) pro.get("name");
//		String password = (String) pro.get("password");

		// Step 1: Load the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			// 2. get the DB "connection" via driver
			String dbURL = "jdbc:mysql://localhost:3306/tyss_db?autoReconnect=true&useSSL=false";

			// overloaded method with 2parameters
			conn = DriverManager.getConnection(dbURL, pro);

			// 3.Issue SQL queries via Connection

			String query = "select * from employee_info where eid=?";
			prepstmt = conn.prepareStatement(query);
			prepstmt.setInt(1, eid);
			rs = prepstmt.executeQuery();

			EmployeePrimaryInfo records = new EmployeePrimaryInfo();

			// 4. Process the results returned by "SQL queries"
			if (rs.next()) {

				records.setEid(rs.getInt("eid"));
				records.setEname(rs.getString("ename"));
				records.setSalary(rs.getInt("salary"));
				records.setEmail(rs.getString("email"));
				records.setMobilenumber(rs.getLong("mobilenumber"));
				records.setJoiningdate(rs.getString("joiningdate"));
				records.setDOB(rs.getString("DOB"));
				records.setAge(rs.getInt("age"));
				records.setDeptid(rs.getInt("deptid"));
				
				
				System.out.println("===========================");

				return records;

			} else {
				return null;
			}

//			if(rowsaffected!=0) {
//				System.out.println("deleted "+ rowsaffected + " rows");
//			} else {
//				System.out.println("record not deleted");
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. close all JDBC Objects
			try {
				if (conn != null) {
					conn.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (prepstmt != null) {
					prepstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
