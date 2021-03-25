package com.tyss.designpattern.dao;

public class EmployeeDaoFactory {
	private static String dbInteractionType = "JPA";

	private EmployeeDaoFactory() {

	}

	public static EmployeeDAO getinstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equalsIgnoreCase("JDBC")) {
			dao = new EmployeeInfoJDBCImplement();
			System.out.println("jdbc object created");
		} else if (dbInteractionType.equalsIgnoreCase("JPA")) {
			dao = new EmployeeDAOJPAImplement();
			System.out.println("jpa with hibernate object created");
		} else {
			dao = new EmployeeDAOSpring();
			System.out.println("spring object created");
		}
		return dao;
	}

}
