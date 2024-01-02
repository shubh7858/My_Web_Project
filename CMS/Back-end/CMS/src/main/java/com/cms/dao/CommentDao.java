package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.Models.Comment;


public interface CommentDao extends JpaRepository<Comment , Long>{

}
