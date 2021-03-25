package com.tyss.designpattern.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeDAOJPAImplement implements EmployeeDAO {

	public EmployeePrimaryInfo getDetailsOnEid(int eid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo records = manager.find(EmployeePrimaryInfo.class, eid);

		if (records != null) {

			return records;
		}

		manager.close();
		return records;

	}

	public boolean deleteByEmployeeID(int eid) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			String jpql = "delete from EmployeePrimaryInfo e where e.eid=:idd";
			transaction.begin();
			Query query = manager.createQuery(jpql);
			query.setParameter("idd", eid);
			int record = query.executeUpdate();
			transaction.commit();
			if (record != 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		manager.close();
		return false;
	}

	public boolean updateEmployeeDetails(EmployeePrimaryInfo info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			String jpql = "update EmployeePrimaryInfo e set  e.ename=:name where e.eid=:id";
			transaction.begin();
			Query query = manager.createQuery(jpql);
			query.setParameter("id", info.getEid());
			query.setParameter("name", info.getEname());
			int record = query.executeUpdate();
			transaction.commit();
			if (record != 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		manager.close();
		return false;
	}

	public boolean createEmployeeDetails(EmployeePrimaryInfo info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			System.out.println("before persist");
			manager.persist(info);
			System.out.println("after persist");
			transaction.commit();
			System.out.println("record inserted");
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		manager.close();
		return false;

	}

	public List<EmployeePrimaryInfo> getAllEmployeeDetails() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from EmployeePrimaryInfo e";
		Query query = manager.createQuery(jpql);
		List<EmployeePrimaryInfo> personList = query.getResultList();
		return personList;

	}

}
