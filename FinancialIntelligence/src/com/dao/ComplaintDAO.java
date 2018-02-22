package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.ComplaintVO;

@Repository

public class ComplaintDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertComplaint(ComplaintVO complaintVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(complaintVO);
		tr.commit();
	}

	public void deleteComplaint(ComplaintVO complaintVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(complaintVO);
		tr.commit();
	}

	public List getAllComplaints() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM ComplaintVO");
		List list = query.list();
		return list;
	}
}
