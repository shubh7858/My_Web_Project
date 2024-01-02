package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.Models.Favourites;

public interface FavouriteDao extends JpaRepository<Favourites , Long> {

}
