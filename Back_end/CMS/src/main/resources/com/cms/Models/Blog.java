package com.cms.Models;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Blog {
    
	@Id @Generated(strategy = GenerationType.IDENTITY)
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
	private List<Favourite> favourites;
	
	@OneToMany(mappedBy="blog")
	private List<comment> comments;
	
	
	public Blog(String title, String author, LocalDateTime updated_timestamp, String content, String category,
			Long user_id) {
		super();
		this.title = title;
		this.author = author;
		this.updated_timestamp = updated_timestamp;
		this.content = content;
		this.category = category;
		this.user_id = user_id;
	}
	
}
