package com.cms.dto;
import java.time.LocalDateTime;

public class BlogDto {
    
	private String title;
	
	private String author;
	
	private String content;
	
	private String category;
	
	private Long userID;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public BlogDto(String title, String author, String content, String category, Long userID) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
		this.category = category;
		this.userID = userID;
	}
	
	public BlogDto() {
		super();
	}
	
	
}
