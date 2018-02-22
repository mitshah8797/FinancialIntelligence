package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class DocumentMappingDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List getRelatedDocuments() throws SQLException {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM DocumentMappingVO AS vo WHERE vo.loanType.loanTypeId = 1");
		return query.list();
	}
}
