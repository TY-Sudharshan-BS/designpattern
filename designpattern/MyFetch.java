package com.tyss.designpattern;

import java.io.IOException;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class MyFetch {
	public static void main(String[] args) throws IOException {
		CrudOperations operations = new CrudOperations();
		EmployeePrimaryInfo empInfo = operations.getDetailsOnEid(104);

		System.out.println("Id =   " + empInfo.getEid());
		System.out.println("name = " + empInfo.getEname());
		System.out.println("sal=   " + empInfo.getSalary());
		System.out.println("email= " + empInfo.getEmail());
		System.out.println("mobile= " + empInfo.getMobilenumber());
		System.out.println("jdate= " + empInfo.getJoiningdate());
		System.out.println("dob= " + empInfo.getDOB());
		System.out.println("age= " + empInfo.getAge());
		System.out.println("dept id= "+empInfo.getDeptid());
		
		System.out.println("***********************************");
	}

}
