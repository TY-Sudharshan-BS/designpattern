package com.tyss.designpattern.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeInfoJDBCImplement implements EmployeeDAO {

	public EmployeePrimaryInfo getDetailsOnEid(int eid) {

		Connection conn = null;
		PreparedStatement prepstmt = null;
		ResultSet rs = null;

		// Step 1: Load the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			// 2. get the DB "connection" via driver
			String dbURL = "jdbc:mysql://localhost:3306/tyss_db?autoReconnect=true&useSSL=false";

			// overloaded method with 2parameters
			conn = DriverManager.getConnection(dbURL, "root", "root");

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

			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
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

	/******************************************************************************/

	public boolean deleteByEmployeeID(int eid) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Step 1: Load the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// 2. get the DB "connection" via driver
			String dbURL = "jdbc:mysql://localhost:3306/tyss_db?autoReconnect=true&useSSL=false";

			// overloaded method with 2parameters
			conn = DriverManager.getConnection(dbURL, "root", "root");

			// 3.Issue SQL queries via Connection

			String query = "delete from employee_info  where eid=?";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, eid);
			int delResult = stmt.executeUpdate();
//			EmployeePrimaryInfo records = new EmployeePrimaryInfo();

			// 4. Process the results returned by "SQL queries"
			if (delResult != 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			// 5. close all JDBC Objects
			try {
				if (conn != null) {
					conn.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/******************************************************************************/

	public boolean updateEmployeeDetails(EmployeePrimaryInfo info) {
		Connection conn = null;
		PreparedStatement prepstmt = null;
		ResultSet rs = null;

		// Step 1: Load the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// 2. get the DB "connection" via driver
			String dbURL = "jdbc:mysql://localhost:3306/tyss_db?autoReconnect=true&useSSL=false";

			// overloaded method with 2parameters
			conn = DriverManager.getConnection(dbURL, "root", "root");

			// 3.Issue SQL queries via Connection

			String query = "update employee_info set eid=? where ename='nairobi'";
			prepstmt = conn.prepareStatement(query);
			prepstmt.setInt(1, info.getEid());

			int rowsaffected = prepstmt.executeUpdate();

			// 4. Process the results returned by "SQL queries"
			if (rowsaffected != 0) {
				return true;
			} else {
				return false;

			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
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
	}

	/******************************************************************************/

	public boolean createEmployeeDetails(EmployeePrimaryInfo info) {
		Connection conn = null;
		PreparedStatement prepstmt = null;
		ResultSet rs = null;

		// Step 1: Load the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// 2. get the DB "connection" via driver
			String dbURL = "jdbc:mysql://localhost:3306/tyss_db?autoReconnect=true&useSSL=false";

			// overloaded method with 2parameters
			conn = DriverManager.getConnection(dbURL, "root", "root");

			// 3.Issue SQL queries via Connection

			String query = "insert into employee_info values(?, 'grey', 'grey@gmail', 8956545454,'clerk','2016-02-02',60000, '1995-06-06', 'A+ve', 20,30,'2018KA1234','male', 'no', 2, 7839,1000,'nairobi')";
			prepstmt = conn.prepareStatement(query);
			prepstmt.setInt(1, info.getEid());

			int rowsaffected = prepstmt.executeUpdate();

			// 4. Process the results returned by "SQL queries"
			if (rowsaffected != 0) {
				return true;
			} else {
				return false;

			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
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
	}

	/******************************************************************************/
	public List<EmployeePrimaryInfo> getAllEmployeeDetails() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<EmployeePrimaryInfo> list = new ArrayList<EmployeePrimaryInfo>();

		// Step 1: Load the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			// 2. get the DB "connection" via driver
			String dbURL = "jdbc:mysql://localhost:3306/tyss_db?autoReconnect=true&useSSL=false";

			// overloaded method with 2parameters
			conn = DriverManager.getConnection(dbURL, "root", "root");

			// 3.Issue SQL queries via Connection
			String query = "select * from employee_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println(rs);
			
//			 4. Process the results returned by "SQL queries"
			while (rs.next()) {
				EmployeePrimaryInfo record = new EmployeePrimaryInfo();
				System.out.println("===========================");
				record.setEid(rs.getInt("eid"));
				record.setEname(rs.getString("ename"));
				record.setSalary(rs.getInt("salary"));
				record.setEmail(rs.getString("email"));
				record.setMobilenumber(rs.getLong("mobilenumber"));
				record.setJoiningdate(rs.getString("joiningdate"));
				record.setDOB(rs.getString("DOB"));
				record.setAge(rs.getInt("age"));
				record.setDeptid(rs.getInt("deptid"));
				record.setDesignation(rs.getString("designation"));
				System.out.println("im adding record " + rs.getInt("eid"));

				list.add(record);
				System.out.println("im adding record " + rs.getInt("eid"));

			}
			
			

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
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}

}
