package com.cms.dto;

public class CommentDto {

 private String Comment;
 
 private long blogID;
 
 private long userID;

public String getComment() {
	return Comment;
}

public void setComment(String comment) {
	Comment = comment;
}

public long getBlogID() {
	return blogID;
}

public void setBlogID(long blogID) {
	this.blogID = blogID;
}

public long getUserID() {
	return userID;
}

public void setUserID(long userID) {
	this.userID = userID;
}

public CommentDto(String comment, long blogID, long userID) {
	super();
	Comment = comment;
	this.blogID = blogID;
	this.userID = userID;
}
	
 public CommentDto() {
	 super();
 }
 
 
 
 
 
 
 
}


