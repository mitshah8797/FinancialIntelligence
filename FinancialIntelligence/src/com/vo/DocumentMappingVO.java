package com.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DocumentMappingTable")

public class DocumentMappingVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mappingId;

	@ManyToOne
	private LoanTypeVO loanType;

	@ManyToOne
	private DocumentTypeVO docType;

	public DocumentMappingVO() {

	}

	public int getMappingId() {
		return mappingId;
	}

	public void setMappingId(int mappingId) {
		this.mappingId = mappingId;
	}

	public LoanTypeVO getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanTypeVO loanType) {
		this.loanType = loanType;
	}

	public DocumentTypeVO getDocType() {
		return docType;
	}

	public void setDocType(DocumentTypeVO docType) {
		this.docType = docType;
	}
}
