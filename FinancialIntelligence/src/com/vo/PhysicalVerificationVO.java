package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PhysicalVerificationTable")

public class PhysicalVerificationVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int verificationId;
	
	@ManyToOne
	private LoanStaffVO staffMember;
	
	@Column(name="address")
	private String verificationAddress;
	
	@Column(name="verificationDate")
	private String verificationDate;
	
	@Column(name="verificationTime")
	private String verificationTime;
	
	public PhysicalVerificationVO() {
		// TODO Auto-generated constructor stub
	}

	public int getVerificationId() {
		return verificationId;
	}

	public void setVerificationId(int verificationId) {
		this.verificationId = verificationId;
	}

	public String getVerificationAddress() {
		return verificationAddress;
	}

	public void setVerificationAddress(String verificationAddress) {
		this.verificationAddress = verificationAddress;
	}

	public LoanStaffVO getStaffMember() {
		return staffMember;
	}

	public void setStaffMember(LoanStaffVO staffMember) {
		this.staffMember = staffMember;
	}

	public String getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(String verificationDate) {
		this.verificationDate = verificationDate;
	}

	public String getVerificationTime() {
		return verificationTime;
	}

	public void setVerificationTime(String verificationTime) {
		this.verificationTime = verificationTime;
	}
}
