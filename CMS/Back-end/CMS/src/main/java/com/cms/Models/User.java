package com.cms.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String image;

	private String role;
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
	private List<Favourites> favourites;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
	private List<Comment> comments;
	
	
	
public User(String name,String email,String password,String image) {
	super();
	this.name = name;
	this.email = email;
	this.password =password;
	this.image = image;
	
}

	
}
