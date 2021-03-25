package com.tyss.designpattern.testdao;

import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
import com.tyss.designpattern.service.EmployeeServiceInfoImple;

public class TestDAOAllDetails {
	public static void main(String[] args) {
		// JPA
		EmployeeServiceInfoImple service = new EmployeeServiceInfoImple();
		List<EmployeePrimaryInfo> empAll = service.getAllEmployeeDetails();
		for (EmployeePrimaryInfo empInfo : empAll) {
			System.out.println("######################################");
			System.out.println("Id =   " + empInfo.getEid());
			System.out.println("name = " + empInfo.getEname());
			System.out.println("sal=   " + empInfo.getSalary());
			System.out.println("email= " + empInfo.getEmail());
			System.out.println("mobile= " + empInfo.getMobilenumber());
			System.out.println("jdate= " + empInfo.getJoiningdate());
			System.out.println("dob= " + empInfo.getDOB());
			System.out.println("age= " + empInfo.getAge());
			System.out.println("dept id= " + empInfo.getDeptid());
			System.out.println("######################################");
		}
	}
}
