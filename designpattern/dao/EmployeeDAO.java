package com.tyss.designpattern.dao;

import java.io.IOException;
import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public interface EmployeeDAO {
	public EmployeePrimaryInfo getDetailsOnEid(int eid);

	public boolean deleteByEmployeeID(int eid);

	public boolean updateEmployeeDetails(EmployeePrimaryInfo info);

	public boolean createEmployeeDetails(EmployeePrimaryInfo info);

	public List<EmployeePrimaryInfo> getAllEmployeeDetails();

}
