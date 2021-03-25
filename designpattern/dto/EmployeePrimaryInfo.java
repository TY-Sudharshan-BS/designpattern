package com.tyss.designpattern.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "employee_info")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private long mobilenumber;
	@Column
	private String designation;
	@Column
	private String joiningdate;
	@Column
	private int salary;
	@Column
	private String DOB;
	@Column
	private int age;
	@Column
	private int deptid;
	@Column
	private String govtid;
	@Column
	private String gender;
	@Column
	private String maritalstatus;
	@Column
	private int experience;
	@Column
	private int Manager_ID;
	@Column
	private int comm;
	@Column
	private String mgr_name;
	@Column
	private String bloodgroup;
}
