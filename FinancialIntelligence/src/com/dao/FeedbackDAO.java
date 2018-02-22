package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.FeedbackVO;

@Repository

public class FeedbackDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertFeedback(FeedbackVO feedbackVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(feedbackVO);
		tr.commit();
	}

	public void deleteFeedback(FeedbackVO feedbackVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(feedbackVO);
		tr.commit();
	}

	public List getAllFeedbacks() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM FeedbackVO");
		List list = query.list();
		return list;
	}
}
