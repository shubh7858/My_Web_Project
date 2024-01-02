package com.cms.dto;

public class FavouriteDto {

	private long blogid;
	
	private long userId;

	public long getBlogid() {
		return blogid;
	}

	public void setBlogid(long blogid) {
		this.blogid = blogid;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public FavouriteDto(long blogid, long userId) {
		super();
		this.blogid = blogid;
		this.userId = userId;
	}

	public FavouriteDto() {
		super();
	}
	
	
	
}
