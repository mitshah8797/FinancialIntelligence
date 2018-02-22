package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.LoanTypeVO;

@Repository

public class LoanTypeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertLoanType (LoanTypeVO loanTypeVO) throws SQLException{
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(loanTypeVO);
			tr.commit();
	}

	public List getAllType() {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("FROM LoanTypeVO");
		List list = query.list();
		tr.commit();
		return list;
	}

	public void deleteType(LoanTypeVO loanTypeVO) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(loanTypeVO);
		tr.commit();
	}
	
	public double getInterestRate (int loanTypeId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM LoanTypeVO AS vo WHERE vo.loanTypeId = ?");
		query.setParameter(0, loanTypeId);
		LoanTypeVO temp =  (LoanTypeVO) query.list().get(0);
		return temp.getLoanTypeInterest();
	}
}
