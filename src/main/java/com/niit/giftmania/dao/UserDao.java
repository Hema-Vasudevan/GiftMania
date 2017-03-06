package com.niit.giftmania.dao;

import java.util.*;

import com.niit.giftmania.model.User;

public interface UserDao {
	public List<User> getAllUserDetails();
	public void addUser(User s);
	public void removeUser(int uid);
	public void updateUser(User s);
	public User getPersonById(int uid);
}
