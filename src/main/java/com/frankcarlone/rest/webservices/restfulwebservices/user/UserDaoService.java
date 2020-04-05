package com.frankcarlone.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
//	Counter to manually add the id
	private static int usersCount = 3;
	
//	Initiate values - dummy data
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Steve", new Date()));
		users.add(new User(3, "Tom", new Date()));
		
	}
	
//	Find all users
	public List<User> findAll() {
		return users;
	}
	
//	Add a user
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
//	Find a user
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
}
