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
import com.vo.PhysicalVerificationVO;

@Repository

public class PhysicalVerificationDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertVerification (PhysicalVerificationVO physicalVerificationVO) throws SQLException {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(physicalVerificationVO);
			tr.commit();
	}
	
	public List getAllVerificationData() {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("FROM PhysicalVerificationVO");
		List list = query.list();
		tr.commit();
		return list;
	}

	public void deleteVerificationData(PhysicalVerificationVO physicalVerificationVO) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(physicalVerificationVO);
		tr.commit();
	}

}
