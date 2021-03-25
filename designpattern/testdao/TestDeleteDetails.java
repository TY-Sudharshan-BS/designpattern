package com.tyss.designpattern.testdao;

import com.tyss.designpattern.service.EmployeeServiceInfoImple;

public class TestDeleteDetails {
	public static void main(String[] args) {
		EmployeeServiceInfoImple services = new EmployeeServiceInfoImple();
		boolean emp = services.deleteByEmployeeID(108);
		if (emp) {
			System.out.println("record deleted successfully");
		} else {
			System.out.println("record cannot be deleted ");
		}
	}
}
