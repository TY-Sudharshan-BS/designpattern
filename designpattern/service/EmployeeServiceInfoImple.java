package com.tyss.designpattern.service;

import java.util.List;

import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDaoFactory;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeServiceInfoImple implements EmployeeServiceInfo {

	EmployeeDAO dao = EmployeeDaoFactory.getinstance();

	@Override
	public EmployeePrimaryInfo getDetailsOnEid(int eid) {
		if (eid != 0) {
			return dao.getDetailsOnEid(eid);
		} else
			return null;
	}

	@Override
	public boolean deleteByEmployeeID(int eid) {
		if (eid != 0) {
			return dao.deleteByEmployeeID(eid);
		} else {
			return false;
		}
	}

	@Override
	public boolean updateEmployeeDetails(EmployeePrimaryInfo info) {
		if (true) {
			return dao.updateEmployeeDetails(info);
		} else
			return false;
	}

	@Override
	public boolean createEmployeeDetails(EmployeePrimaryInfo info) {
		if (true) {
			return dao.createEmployeeDetails(info);
		} else
			return false;
	}

	@Override
	public List<EmployeePrimaryInfo> getAllEmployeeDetails() {
		return dao.getAllEmployeeDetails();
	}

}
