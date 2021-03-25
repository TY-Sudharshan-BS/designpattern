package com.tyss.designpattern.service;

import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public interface EmployeeServiceInfo {
	public EmployeePrimaryInfo getDetailsOnEid(int eid);

	public boolean deleteByEmployeeID(int eid);

	public boolean updateEmployeeDetails(EmployeePrimaryInfo info);

	public boolean createEmployeeDetails(EmployeePrimaryInfo info);

	public List<EmployeePrimaryInfo> getAllEmployeeDetails();

}
