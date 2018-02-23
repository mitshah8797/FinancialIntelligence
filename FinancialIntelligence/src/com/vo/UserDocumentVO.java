package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserDocumentTable")

public class UserDocumentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userDocId;

	@ManyToOne
	private DocumentTypeVO document;

	@ManyToOne
	private UserVO customer;
	
	@Column(name="DocURL")
	private String documentURL;

	public UserDocumentVO() {
	}

	public int getUserDocId() {
		return userDocId;
	}

	public void setUserDocId(int userDocId) {
		this.userDocId = userDocId;
	}

	public DocumentTypeVO getDocument() {
		return document;
	}

	public void setDocument(DocumentTypeVO document) {
		this.document = document;
	}

	public UserVO getCustomer() {
		return customer;
	}

	public void setCustomer(UserVO customer) {
		this.customer = customer;
	}

	public String getDocumentURL() {
		return documentURL;
	}

	public void setDocumentURL(String documentURL) {
		this.documentURL = documentURL;
	}
}
