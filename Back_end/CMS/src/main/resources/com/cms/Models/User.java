package com.cms.Models;

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

@Entity(name="users")
@Table (name="")
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

	@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
	private List<favourite> favourites;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
	private List<comment> comments;
	
public User(String name,String email,String password,String image) {
	super();
	this.name = name;
	this.email = email;
	this.password =passwors;
	this.image = image;
	
}

	
}
