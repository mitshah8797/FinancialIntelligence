package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PostTable")

public class PostVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postId;
	
	@Column(name = "PostName")
	private String postName;
	
	@Column(name = "Description")
	private String postDescription;
	
	public PostVO() {
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDesc) {
		this.postDescription = postDesc;
	}
}
