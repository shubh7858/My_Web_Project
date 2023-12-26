package com.cms.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="favourite")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Favourites {
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "blog_id")
	private Blog blog;
	
	@ManyToOne(fetch =FetchType.LAZY)
	private User user;
	
	
	public Favourite(Blog blog, User user) {
		super();
		this.blog = blog;
		this.user = user;
	}

}
