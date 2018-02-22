package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.PostVO;

@Repository

public class PostDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertPost(PostVO postVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(postVO);
		tr.commit();
	}

	public List getAllPost() throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("FROM PostVO");
		List list = query.list();
		tr.commit();
		return list;
	}
	
	public void deletePost(PostVO postVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(postVO);
		tr.commit();
	}
}
