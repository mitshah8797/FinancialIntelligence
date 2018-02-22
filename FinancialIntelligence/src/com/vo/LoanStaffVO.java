package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LoanStaffTable")

public class LoanStaffVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanStaffId;

	@Column(name = "FirstName")
	private String loanStaffFirstName;

	@Column(name = "LastName")
	private String loanStaffLastName;

	@Column(name = "Description")
	private String loanStaffDescription;
	
	@ManyToOne
	private PostVO post;

	public LoanStaffVO() {
		// TODO Auto-generated constructor stub
	}

	public int getLoanStaffId() {
		return loanStaffId;
	}

	public void setLoanStaffId(int loanStaffId) {
		this.loanStaffId = loanStaffId;
	}

	public String getLoanStaffFirstName() {
		return loanStaffFirstName;
	}

	public void setLoanStaffFirstName(String loanStaffFirstName) {
		this.loanStaffFirstName = loanStaffFirstName;
	}

	public String getLoanStaffLastName() {
		return loanStaffLastName;
	}

	public void setLoanStaffLastName(String loanStaffLastName) {
		this.loanStaffLastName = loanStaffLastName;
	}

	public String getLoanStaffDescription() {
		return loanStaffDescription;
	}

	public void setLoanStaffDescription(String loanStaffDescription) {
		this.loanStaffDescription = loanStaffDescription;
	}

	public PostVO getPost() {
		return post;
	}

	public void setPost(PostVO post) {
		this.post = post;
	}
}
