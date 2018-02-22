package com.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.UserVO;

@Repository

public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertUser(UserVO userVO) throws SQLException {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(userVO.getLogin());
		session.saveOrUpdate(userVO);
		tr.commit();
	}
}
