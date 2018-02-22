package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoanTypeTable")

public class LoanTypeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanTypeId;

	@Column(name = "TypeName")
	private String loanTypeName;

	@Column(name = "Description")
	private String loanTypeDescription;

	@Column(name = "DocumentDetails")
	private String loanTypeDocumentDetails;

	@Column(name = "Interest")
	private double loanTypeInterest;

	public LoanTypeVO() {
		// TODO Auto-generated constructor stub
	}

	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public String getLoanTypeDescription() {
		return loanTypeDescription;
	}

	public void setLoanTypeDescription(String loanTypeDescription) {
		this.loanTypeDescription = loanTypeDescription;
	}

	public String getLoanTypeDocumentDetails() {
		return loanTypeDocumentDetails;
	}

	public void setLoanTypeDocumentDetails(String loanTypeDocumentDetails) {
		this.loanTypeDocumentDetails = loanTypeDocumentDetails;
	}

	public double getLoanTypeInterest() {
		return loanTypeInterest;
	}

	public void setLoanTypeInterest(double loanTypeInterest) {
		this.loanTypeInterest = loanTypeInterest;
	}
}
