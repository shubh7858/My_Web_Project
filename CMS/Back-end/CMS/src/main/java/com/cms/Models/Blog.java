package com.cms.Models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity (name="blogs")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Blog {
    
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	@Column
	private LocalDateTime updated_timestamp;
	
	@Column (columnDefinition = "MEDIUMTEXT")
	private String content;
	
	@Column 
	private String category;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="blog")
	private List<Favourites> favourites;
	
	@OneToMany(mappedBy="blog")
	private List<Comment> comments;
	
	
	
	
	public Blog(String title, String author, LocalDateTime updated_timestamp, String content, String category,
			User user) {
		super();
		this.title = title;
		this.author = author;
		this.updated_timestamp = updated_timestamp;
		this.content = content;
		this.category = category;
		this.user = user;
	}




	public Blog() {
		super();
	}
	
	
	
}
