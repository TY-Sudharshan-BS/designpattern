package com.tyss.designpattern.testdao;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
import com.tyss.designpattern.service.EmployeeServiceInfoImple;

public class TestAddDetails {
	public static void main(String[] args) {
		EmployeeServiceInfoImple services = new EmployeeServiceInfoImple();
		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
		emp.setEid(111);
		emp.setEname("queen");
		emp.setEmail("queen@gmail");
		emp.setAge(20);
		emp.setDeptid(20);
		emp.setDesignation("manager");
		emp.setDOB("1997-06-07");
		emp.setJoiningdate("2016-03-01");
		emp.setSalary(500000);
		emp.setMobilenumber(785512000);
		emp.setBloodgroup("A+ve");
//		emp.setComm(600);
//		emp.setExperience(3);
//		emp.setGovtid("KA20203156");
//		emp.setGender("male");
//		emp.setManager_ID(7782);
//		emp.setMgr_name("jeevan");
//		emp.setMaritalstatus("yes");
		boolean addInfo = services.createEmployeeDetails(emp);
		if (addInfo) {
			System.out.println("record inserted successfully");
		} else {
			System.out.println("record cannot be inserted ");
		}
	}
}
