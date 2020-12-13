package com.conveyhs.interview.model;

import java.util.Date;

public class Post {
	int id;
	String subject;
	int userId;
	Date posted;
	Date updated;
	
	public Post(int id, String subject, int userId, Date posted, Date updated) {
		super();
		this.id = id;
		this.subject = subject;
		this.userId = userId;
		this.posted = posted;
		this.updated = updated;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getAuthorId() {
		return userId;
	}

	public void setAuthorId(int authorId) {
		this.userId = authorId;
	}

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
