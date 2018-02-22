package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.LoanStaffVO;

@Repository

public class LoanStaffDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertLoanStaff (LoanStaffVO loanStaffVO) throws SQLException {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(loanStaffVO);
			tr.commit();
	}
	
	public List getAllStaff() throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("FROM LoanStaffVO");
		List list = query.list();
		tr.commit();
		return list;
	}
	
	public void deleteStaff(LoanStaffVO loanStaffVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(loanStaffVO);
		tr.commit();
	}
}
