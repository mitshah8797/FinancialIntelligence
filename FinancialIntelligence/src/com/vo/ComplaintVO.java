package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ComplaintTable")

public class ComplaintVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int complaintId;

	@Column(name = "CompaintSubject")
	private String complaintSubject;

	@Column(name = "CompaintDescription")
	private String complaintDescription;

	@ManyToOne
	private LoginVO user;

	public ComplaintVO() {
		// TODO Auto-generated constructor stub
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public LoginVO getUser() {
		return user;
	}

	public void setUser(LoginVO user) {
		this.user = user;
	}

	public String getComplaintSubject() {
		return complaintSubject;
	}

	public void setComplaintSubject(String complaintSubject) {
		this.complaintSubject = complaintSubject;
	}
}
