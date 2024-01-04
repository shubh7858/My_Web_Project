package com.cms.services;

import java.util.List;

import com.cms.Models.Blog;
import com.cms.dto.BlogDto;

public interface BlogService {

	public String saveBlog(BlogDto blog);
	
	public List<Blog> showBlogs();
	
}
