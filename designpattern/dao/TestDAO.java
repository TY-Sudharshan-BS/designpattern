package com.tyss.designpattern.dao;

import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
import com.tyss.designpattern.service.EmployeeServiceInfoImple;
//import com.tyss.jpawithhibernate.dto.Person;

public class TestDAO {
	public static void main(String[] args) {

//		EmployeeInfoJDBCImplement jdbc = new EmployeeInfoJDBCImplement();
//		EmployeePrimaryInfo empInfo = jpa.getDetailsOnEid(105);

		// delete jdbc id
//		EmployeeInfoJDBCImplement jdbc = new EmployeeInfoJDBCImplement();
//		boolean deleted_id = jdbc.deleteByEmployeeID(106);
//		System.out.println(deleted_id);

//		EmployeeDAOJPAImplement jpa = new EmployeeDAOJPAImplement();
//		EmployeePrimaryInfo empInfo = jpa.getDetailsOnEid(105);
//		List<EmployeePrimaryInfo> empInfo = jpa.getAllEmployeeDetails();

//		EmployeeDAOSpring springs = new EmployeeDAOSpring();
//		EmployeePrimaryInfo empInfo = jpa.getDetailsOnEid(105);

// *************************************************************************************//
		// factory design pattern
		EmployeeDAO dao = EmployeeDaoFactory.getinstance();

//***************************JDBC*****************************************************//
		// jdbc details on id
//		EmployeePrimaryInfo empInfo = dao.getDetailsOnEid(106);

		// jdbc details insert
//		EmployeePrimaryInfo e1 =new EmployeePrimaryInfo();
//		e1.setEid(106);
//		boolean insertdet = dao.createEmployeeDetails(e1);
//		if(insertdet)
//		System.out.println("inserted 1");
//		else
//			System.out.println("not inserted");

		// jdbc getAll employee details
//		List<EmployeePrimaryInfo> empInfo = dao.getAllEmployeeDetails();
//		for (EmployeePrimaryInfo lists : empInfo) {
//			System.out.println("*********************************");
//			System.out.println(lists.getEid());
//			System.out.println(lists.getEname());
//			System.out.println(lists.getEmail());
//			System.out.println(lists.getAge());
//			System.out.println(lists.getDeptid());
//			System.out.println(lists.getJoiningdate());
//			System.out.println(lists.getSalary());
//			System.out.println(lists.getMobilenumber());
//			System.out.println(lists.getDOB());
//			System.out.println(lists.getDesignation());
//			System.out.println("*********************************");
//
//		}

		// jdbc update employee details
//		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
//		emp.setEid(111);
//		boolean updatedinfo = dao.updateEmployeeDetails(emp);
//		if (updatedinfo)
//			System.out.println("updated record");
//		else
//			System.out.println("cannot be updated");

		// ************************JPAA******************************************//
		// jpa get all details
//		List<EmployeePrimaryInfo> empInfo = dao.getAllEmployeeDetails();

//		System.out.println("Id =   " + empInfo.getEid());
//		System.out.println("name = " + empInfo.getEname());
//		System.out.println("sal=   " + empInfo.getSalary());
//		System.out.println("email= " + empInfo.getEmail());
//		System.out.println("mobile= " + empInfo.getMobilenumber());
//		System.out.println("jdate= " + empInfo.getJoiningdate());
//		System.out.println("dob= " + empInfo.getDOB());
//		System.out.println("age= " + empInfo.getAge());
//		System.out.println("dept id= " + empInfo.getDeptid());

//
//		for (EmployeePrimaryInfo empAll : empInfo) {
//			System.out.println("Id =   " + empAll.getEid());
//			System.out.println("name = " + empAll.getEname());
//			System.out.println("sal=   " + empAll.getSalary());
//			System.out.println("email= " + empAll.getEmail());
//			System.out.println("mobile= " + empAll.getMobilenumber());
//			System.out.println("jdate= " + empAll.getJoiningdate());
//			System.out.println("dob= " + empAll.getDOB());
//			System.out.println("age= " + empAll.getAge());
//			System.out.println("dept id= " + empAll.getDeptid());
//			System.out.println("***********************************");
//		}
//		System.out.println("***********************************");

		// jpa delete record based on id
//		boolean delRec = dao.deleteByEmployeeID(106);
//		System.out.println(delRec);

		// jpa update record
//		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
//		emp.setEid(112);
//		emp.setEname("nairobi");
//		boolean updatedinfo = dao.updateEmployeeDetails(emp);
//		if (updatedinfo)
//			System.out.println("updated record");
//		else
//			System.out.println("cannot be updated");

		// jpa create employee
		EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
		emp.setEid(113);
		emp.setEname("king");
		emp.setEmail("king@gmail");
		emp.setAge(20);
		emp.setDeptid(10);
		emp.setDesignation("doctor");
		emp.setDOB("1997-06-12");
		emp.setJoiningdate("2016-03-01");
		emp.setSalary(5000);
		
		boolean insertInfo = dao.createEmployeeDetails(emp);
		if (insertInfo)
			System.out.println("inserted");
		else
			System.out.println("cannot be inserted");

//********************************Service layer**********************************///
//		EmployeeServiceInfoImple service = new EmployeeServiceInfoImple();
//		EmployeePrimaryInfo empInfo = service.getDetailsOnEid(101);
//		System.out.println("Id =   " + empInfo.getEid());
//		System.out.println("name = " + empInfo.getEname());
//		System.out.println("sal=   " + empInfo.getSalary());
//		System.out.println("email= " + empInfo.getEmail());
//		System.out.println("mobile= " + empInfo.getMobilenumber());
//		System.out.println("jdate= " + empInfo.getJoiningdate());
//		System.out.println("dob= " + empInfo.getDOB());
//		System.out.println("age= " + empInfo.getAge());
//		System.out.println("dept id= " + empInfo.getDeptid());

	}
}
