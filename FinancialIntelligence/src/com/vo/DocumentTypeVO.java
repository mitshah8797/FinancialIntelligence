package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DocumentTypeTable")

public class DocumentTypeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentTypeId;
	
	@Column(name = "DocumentType")
	private String documentType;
	
	public DocumentTypeVO() {
		// TODO Auto-generated constructor stub
	}

	public int getDocumentTypeId() {
		return documentTypeId;
	}

	public void setDocumentTypeId(int documentTypeId) {
		this.documentTypeId = documentTypeId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
}
