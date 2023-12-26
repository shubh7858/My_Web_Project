package com.cms.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="comments")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Comment {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
  private Long id;
  
  private String comment;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="blog_id")
  private Blog blog;
  
  @ManyToOne(fetch = FetchType.LAZY)
  private User user;
  
  public Comment(String comment, Blog blog, User user) {
		super();
		this.comment = comment;
		this.blog = blog;
		this.user = user;
	}
  
}
