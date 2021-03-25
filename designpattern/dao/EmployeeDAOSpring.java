package com.tyss.designpattern.dao;

import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeDAOSpring implements EmployeeDAO {

	public EmployeePrimaryInfo getDetailsOnEid(int eid) {
		EmployeePrimaryInfo records = new EmployeePrimaryInfo();
		return records;
	}

	public boolean deleteByEmployeeID(int eid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmployeeDetails(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createEmployeeDetails(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<EmployeePrimaryInfo> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
