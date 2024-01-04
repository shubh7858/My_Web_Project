package com.cms.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.BlogDao;
import com.cms.dao.FavouriteDao;
import com.cms.dao.UserDao;
import com.cms.dto.FavouriteDto;
import com.cms.Models.Blog;
import com.cms.Models.Favourites;
import com.cms.Models.User;

@Service
public class FavouriteServiceImpl implements FavouriteService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private BlogDao bdao;
	
	@Autowired
	private UserDao udao;
	
	@Autowired
	private FavouriteDao fdao;

	@Override
	public String addLike(FavouriteDto fdto) {
		
		Blog blog =  bdao.findById(fdto.getBlogid()).orElse(null);
		User user = udao.findById(fdto.getUserId()).orElse(null);
		
		if(blog != null && user != null) {
			try {
				Favourites mappedFav = mapper.map(fdto, Favourites.class);
				mappedFav.setBlog(blog);
				mappedFav.setUser(user);
				
				return "Post liked";
			}catch(Exception e) {
				return "Something went wrong";
			}
		}
		else if(blog == null) {
			return "Blog not found";
		}	
		else {
			return "User not found";
		}
	}

}