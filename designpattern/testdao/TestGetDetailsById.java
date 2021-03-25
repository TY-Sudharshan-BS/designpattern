package com.tyss.designpattern.testdao;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
import com.tyss.designpattern.service.EmployeeServiceInfoImple;

public class TestGetDetailsById {
	public static void main(String[] args) {
		EmployeeServiceInfoImple services = new EmployeeServiceInfoImple();
		EmployeePrimaryInfo infoById = services.getDetailsOnEid(105);
		System.out.println("Id =   " + infoById.getEid());
		System.out.println("name = " + infoById.getEname());
		System.out.println("sal=   " + infoById.getSalary());
		System.out.println("email= " + infoById.getEmail());
		System.out.println("mobile= " + infoById.getMobilenumber());
		System.out.println("jdate= " + infoById.getJoiningdate());
		System.out.println("dob= " + infoById.getDOB());
		System.out.println("age= " + infoById.getAge());
		System.out.println("dept id= " + infoById.getDeptid());

	}
}
