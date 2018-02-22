package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FeedbackTable")

public class FeedbackVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;

	@Column(name = "FeedbackDescription")
	private String feedbackDescription;

	@ManyToOne
	private LoginVO user;

	public FeedbackVO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}

	public LoginVO getUser() {
		return user;
	}

	public void setUser(LoginVO user) {
		this.user = user;
	}
}
