package com.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.UserDocumentVO;

@Repository

public class UserDocumentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertUserDocument(UserDocumentVO userDocumentVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(userDocumentVO);
		tr.commit();
	}
}
