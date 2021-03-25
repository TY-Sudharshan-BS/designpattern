package com.tyss.designpattern.testdao;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
import com.tyss.designpattern.service.EmployeeServiceInfoImple;

public class TestUpdateDetails {
	public static void main(String[] args) {
		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
		emp.setEid(110);
		emp.setEname("Sachin");
		EmployeeServiceInfoImple services = new EmployeeServiceInfoImple();
		boolean updatedEmp = services.updateEmployeeDetails(emp);
		if (updatedEmp)
			System.out.println("updated record");
		else
			System.out.println("cannot be updated");
	}
}
