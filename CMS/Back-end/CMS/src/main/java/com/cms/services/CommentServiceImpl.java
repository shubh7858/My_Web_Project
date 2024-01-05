package com.cms.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.Models.Blog;
import com.cms.Models.Comment;
import com.cms.Models.User;
import com.cms.dao.BlogDao;
import com.cms.dao.CommentDao;
import com.cms.dao.UserDao;
import com.cms.dto.CommentDto;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDao cdao;
	
	@Autowired
	private BlogDao bdao;
	
	@Autowired
	private UserDao udao;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public String addComment(CommentDto comment) {
		
		Blog blog = bdao.findById(comment.getBlogID()).orElse(null);
		User user =  udao.findById(comment.getUserID()).orElse(null);
		
		if(blog != null && user != null) {
			try {
				Comment mappedComment = mapper.map(comment, Comment.class);
				mappedComment.setBlog(blog);
				mappedComment.setUser(user);
				
				cdao.save(mappedComment);
				return "Comment added successfully";
			}catch(Exception e) {
				return "Something went wrong";
			}
		}
		else if(blog == null){
			return "Blog not found";
		}
		else {
			return "User not found";
		}
	}

	
	

}
